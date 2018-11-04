package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.bean.Carro;
import modelo.bean.Categoria;
import modelo.bean.Modelo;
import modelo.conexao.FabricaConexao;

public class CarroDao {
    
    //abre o caminho até o banco de dados
    PreparedStatement pstm;
    //recebe a conexao com o banco
    Connection conecta;
    //armazena os dados vindos do banco
    ResultSet rs;
    //variavel para executar o comando sql
    String sql;
    
    //metodo para inserir o nome na tabela carro
    public void inserir(Carro carro) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "insert into carro (carchassi,carplaca,carano,carcor,carstatus,carcatcodigo,carmodcodigo) values (?, ?, ?, ?, ?, ?, ?)";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, carro.getChassi());
        pstm.setString(2, carro.getPlaca());
        pstm.setInt(3, carro.getAno());
        pstm.setString(4, carro.getCor());
        pstm.setInt(5, carro.getStatus());
        pstm.setInt(6, carro.getCategoria().getCodigo());
        pstm.setInt(7, carro.getModelo().getCodigo());
        pstm.execute();
        FabricaConexao.fecharConexao();
        
    }//fim do metodo
    
    //metodo para inserir o nome na tabela carro
    public void alterar(Carro carro) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "update carro set carplaca=?, carano=?, carcor=?, carstatus=?, carcatcodigo=?, carmodcodigo=? where carchassi=? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, carro.getPlaca());
        pstm.setInt(2, carro.getAno());
        pstm.setString(3, carro.getCor());
        pstm.setInt(4, carro.getStatus());
        pstm.setInt(5, carro.getCategoria().getCodigo());
        pstm.setInt(6, carro.getModelo().getCodigo());
        pstm.setString(7, carro.getChassi());
        pstm.execute();
        
        /** debug **/
        //System.out.println(carro.getCodigo());
        //System.out.println(carro.getDescricao());
        //System.out.println(carro.getMarca().getCodigo()+"-"+carro.getMarca().getCodigo());
        System.out.println("Alterado");
        FabricaConexao.fecharConexao();
        
    }//fim do metodo
    
        
    //metodo para buscar uma carro no BD
    public Carro buscarChassi(String chassi) throws SQLException{
        Carro carro = null;
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from carro join categoria on catcodigo = carcatcodigo join modelo on modcodigo = carmodcodigo where carchassi = ? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, chassi);
        rs = pstm.executeQuery();
        
        if(rs.next()){
            carro = new Carro();
            carro.setChassi(rs.getString("carchassi"));
            carro.setPlaca(rs.getString("carplaca"));
            carro.setAno(rs.getInt("carano"));
            carro.setCor(rs.getString("carcor"));
            carro.setStatus(rs.getInt("carstatus"));
            
            //instanciando as categorias
            Categoria categoria = new Categoria();
            categoria.setCodigo(rs.getInt("catcodigo"));
            categoria.setNome(rs.getString("carnome"));
            categoria.setPrecoDiaria(rs.getDouble("carprecodiaria"));
            categoria.setDescricao(rs.getString("catdescricao"));
            carro.setCategoria(categoria);//adiciona a categoria do carro selecionado
            
            //instanciando os modelos
            Modelo modelo = new Modelo();
            modelo.setCodigo(rs.getInt("modcodigo"));
            modelo.setDescricao(rs.getString("moddescricao"));
            carro.setModelo(modelo);
        }
        FabricaConexao.fecharConexao();
        
        return carro;
    }
    
    //metodo para excluir uma carro
    public void deletar(String chassi) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "delete from carro where carchassi =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, chassi);
        pstm.execute();
        FabricaConexao.fecharConexao();
        
    }//fim metodo exclusao
    
    public List<Carro> listar() throws SQLException{
        Carro carro = null;
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from carro join categoria on catcodigo = carcatcodigo join modelo on modcodigo = carmodcodigo order by carchassi";
        pstm = conecta.prepareStatement(sql);
        rs = pstm.executeQuery();
        List<Carro> lista = new ArrayList<>();
        while(rs.next()){
            carro = new Carro();
            carro.setChassi(rs.getString("carchassi"));
            carro.setPlaca(rs.getString("carplaca"));
            carro.setAno(rs.getInt("carano"));
            carro.setCor(rs.getString("carcor"));
            carro.setStatus(rs.getInt("carstatus"));
            
            //instanciando as categorias
            Categoria categoria = new Categoria();
            categoria.setCodigo(rs.getInt("catcodigo"));
            categoria.setNome(rs.getString("catnome"));
            categoria.setPrecoDiaria(rs.getDouble("catprecodiaria"));
            categoria.setDescricao(rs.getString("catdescricao"));
            carro.setCategoria(categoria);//adiciona a categoria do carro selecionado
            
            //instanciando os modelos
            Modelo modelo = new Modelo();
            modelo.setCodigo(rs.getInt("modcodigo"));
            modelo.setDescricao(rs.getString("moddescricao"));
            carro.setModelo(modelo);
            
            lista.add(carro);
        }
        
        FabricaConexao.fecharConexao();
        return lista;
    }//fim de lista 
    
    public List<Carro> buscar(String busca) throws SQLException{
        Carro carro = null;
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from carro inner join categoria on catcodigo = carcatcodigo inner join modelo on modcodigo = carmodcodigo "
            + "where carchassi like '%"+busca+"%' or carplaca like '%"+busca+"%' or carano = '"+busca+"' or carcor like '%"+busca+"%' "
            + "or catdescricao like '%"+busca+"%' or moddescricao like '%"+busca+"%' order by carchassi";
        pstm = conecta.prepareStatement(sql);
        rs = pstm.executeQuery();
        List<Carro> lista = new ArrayList<>();
        while(rs.next()){
            carro = new Carro();
            carro.setChassi(rs.getString("carchassi"));
            carro.setPlaca(rs.getString("carplaca"));
            carro.setAno(rs.getInt("carano"));
            carro.setCor(rs.getString("carcor"));
            carro.setStatus(rs.getInt("carstatus"));
            
            //instanciando as categorias
            Categoria categoria = new Categoria();
            categoria.setCodigo(rs.getInt("catcodigo"));
            categoria.setNome(rs.getString("catnome"));
            categoria.setPrecoDiaria(rs.getDouble("catprecodiaria"));
            categoria.setDescricao(rs.getString("catdescricao"));
            carro.setCategoria(categoria);//adiciona a categoria do carro selecionado
            
            //instanciando os modelos
            Modelo modelo = new Modelo();
            modelo.setCodigo(rs.getInt("modcodigo"));
            modelo.setDescricao(rs.getString("moddescricao"));
            carro.setModelo(modelo);
            lista.add(carro);
        }
        FabricaConexao.fecharConexao();
        return lista;
    }//fim de lista de pesquisa
    
}
