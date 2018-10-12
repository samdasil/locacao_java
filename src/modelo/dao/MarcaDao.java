package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}
