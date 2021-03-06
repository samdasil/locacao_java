package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.bean.Marca;
import modelo.conexao.FabricaConexao;

public class MarcaDao {
    
    //abre o caminho até o banco de dados
    PreparedStatement pstm;
    //recebe a conexao com o banco
    Connection conecta;
    //armazena os dados vindos do banco
    ResultSet rs;
    //variavel para executar o comando sql
    String sql;
    
    //metodo para inserir o nome na tabela marca
    public void inserir(Marca marca) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "insert into marca(mardescricao) values (?)";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, marca.getDescricao());
        pstm.execute();
        FabricaConexao.fecharConexao();
        
    }//fim do metodo
    
    //metodo para inserir o nome na tabela marca
    public void alterar(Marca marca) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "update marca set mardescricao= ? where marcodigo =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, marca.getDescricao());
        pstm.setInt(2, marca.getCodigo());
        pstm.execute();
        System.out.println("Alterado");
        FabricaConexao.fecharConexao();
        
    }//fim do metodo
    
        
    //metodo para buscar uma marca no BD
    public Marca buscarCodigo(int codigo) throws SQLException{
        Marca marca = null;
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from marca where marcodigo = ?";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, codigo);
        rs = pstm.executeQuery();
        
        if(rs.next()){
            marca = new Marca();
            marca.setCodigo(rs.getInt("marcodigo"));
            marca.setDescricao(rs.getString("mardescricao"));
        }
        FabricaConexao.fecharConexao();
        
        return marca;
    }
    
    //metodo para excluir uma marca
    public void deletar(int codigo) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "delete from marca where marcodigo =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, codigo);
        pstm.execute();
        FabricaConexao.fecharConexao();
        
    }//fim metodo exclusao
    
    public List<Marca> listar() throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from marca";
        pstm = conecta.prepareStatement(sql);
        rs = pstm.executeQuery();
        List<Marca> lista = new ArrayList<>();
        while(rs.next()){
            Marca marca = new Marca();
            marca.setCodigo(rs.getInt("marcodigo"));
            marca.setDescricao(rs.getString("mardescricao"));
            lista.add(marca);
        }
        
        FabricaConexao.fecharConexao();
        return lista;
    }//fim de lista 
    
    public List<Marca> buscar(String busca) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from marca where marcodigo = '"+busca+"' or mardescricao like '%"+busca+"%' order by mardescricao";
        pstm = conecta.prepareStatement(sql);
        //pstm.setString(1, busca);
        //pstm.setString(2, busca);
        rs = pstm.executeQuery();
        List<Marca> lista = new ArrayList<>();
        while(rs.next()){
            Marca marca = new Marca();
            marca.setCodigo(rs.getInt("marcodigo"));
            marca.setDescricao(rs.getString("mardescricao"));
            lista.add(marca);
        }
        FabricaConexao.fecharConexao();
        return lista;
    }//fim de lista de pesquisa
    
    
}
