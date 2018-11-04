package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.bean.Marca;
import modelo.bean.Modelo;
import modelo.conexao.FabricaConexao;

public class ModeloDao {
    
    //abre o caminho até o banco de dados
    PreparedStatement pstm;
    //recebe a conexao com o banco
    Connection conecta;
    //armazena os dados vindos do banco
    ResultSet rs;
    //variavel para executar o comando sql
    String sql;
    
    //metodo para inserir o nome na tabela modelo
    public void inserir(Modelo modelo) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "insert into modelo (moddescricao,modmarcodigo) values (?, ?)";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, modelo.getDescricao());
        pstm.setInt(2, modelo.getMarca().getCodigo());
        pstm.execute();
        FabricaConexao.fecharConexao();
        
    }//fim do metodo
    
    //metodo para inserir o nome na tabela modelo
    public void alterar(Modelo modelo) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "update modelo set moddescricao= ?, modmarcodigo = ? where modcodigo =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, modelo.getDescricao());
        pstm.setInt(2, modelo.getMarca().getCodigo());
        pstm.setInt(3, modelo.getCodigo());
        pstm.execute();
        
        System.out.println(modelo.getCodigo());
        System.out.println(modelo.getDescricao());
        System.out.println(modelo.getMarca().getCodigo()+"-"+modelo.getMarca().getCodigo());
        System.out.println("Alterado");
        FabricaConexao.fecharConexao();
        
    }//fim do metodo
    
        
    //metodo para buscar uma modelo no BD
    public Modelo buscarCodigo(int codigo) throws SQLException{
        Modelo modelo = null;
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from modelo join marca on marcodigo = modmarcodigo where modcodigo = ?";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, codigo);
        rs = pstm.executeQuery();
        
        if(rs.next()){
            modelo = new Modelo();
            modelo.setCodigo(rs.getInt("modcodigo"));
            modelo.setDescricao(rs.getString("moddescricao"));
            
            //setando a marca
            Marca marca = new Marca();
            marca.setCodigo(rs.getInt("marcodigo"));
            marca.setDescricao(rs.getString("mardescricao"));
            
            //finalizando o set
            modelo.setMarca(marca);
        }
        FabricaConexao.fecharConexao();
        
        return modelo;
    }
    
    //metodo para excluir uma modelo
    public void deletar(int codigo) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "delete from modelo where modcodigo =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, codigo);
        pstm.execute();
        FabricaConexao.fecharConexao();
        
    }//fim metodo exclusao
    
    public List<Modelo> listar() throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from modelo join marca on marcodigo = modmarcodigo order by moddescricao";
        pstm = conecta.prepareStatement(sql);
        rs = pstm.executeQuery();
        List<Modelo> lista = new ArrayList<>();
        while(rs.next()){
            Modelo modelo = new Modelo();
            modelo.setCodigo(rs.getInt("modcodigo"));
            modelo.setDescricao(rs.getString("moddescricao"));
            Marca marca = new Marca();
            marca.setCodigo(rs.getInt("marcodigo"));
            marca.setDescricao(rs.getString("mardescricao"));
            modelo.setMarca(marca);
            lista.add(modelo);
        }
        
        FabricaConexao.fecharConexao();
        return lista;
    }//fim de lista 
    
    public List<Modelo> buscar(String busca) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from modelo inner join marca on marcodigo = modmarcodigo  where modcodigo = '"+busca+"' or moddescricao like '%"+busca+"%' or mardescricao like '%"+busca+"%' order by moddescricao";
        pstm = conecta.prepareStatement(sql);
        rs = pstm.executeQuery();
        List<Modelo> lista = new ArrayList<>();
        while(rs.next()){
            Modelo modelo = new Modelo();
            modelo.setCodigo(rs.getInt("modcodigo"));
            modelo.setDescricao(rs.getString("moddescricao"));
            Marca marca = new Marca();
            marca.setCodigo(rs.getInt("marcodigo"));
            marca.setDescricao(rs.getString("mardescricao"));
            modelo.setMarca(marca);
            lista.add(modelo);
        }
        FabricaConexao.fecharConexao();
        return lista;
    }//fim de lista de pesquisa
    
}
