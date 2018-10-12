
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.bean.Funcionario;
import modelo.conexao.FabricaConexao;

public class FuncionarioDao {
    
    PreparedStatement pstm;
    Connection conecta;
    ResultSet rs;
    String sql;
    
    public void inserir(Funcionario funcionario) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "insert into funcionario(funnome) values (?)";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, funcionario.getNome());
        pstm.execute();
    
        sql = "insert into funcionario(funmatricula) values (?)";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, funcionario.getMatricula());
        pstm.execute();
        
        sql = "insert into funcionario(funlogin) values (?)";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, funcionario.getLogin());
        pstm.execute();
        
        sql = "insert into funcionario(funsenha) values (?)";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, funcionario.getSenha());
        pstm.execute();
        
        /*sql = "insert into funcionario(fungerfuncionario) values (?)";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, funcionario.getGerente());
        pstm.execute();*/
        
              
        
        FabricaConexao.fecharConexao();
        
    }
    
    public void alterar(Funcionario funcionario) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "update funcionario set funnome = ? where funmatricula =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, funcionario.getNome());
        pstm.setInt(2, funcionario.getMatricula());       
        pstm.execute();
           
        sql = "update funcionario set funlogin = ? where funmatricula =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, funcionario.getLogin());
        pstm.setInt(2, funcionario.getMatricula());
        pstm.execute();
       
        sql = "update funcionario set funsenha = ? where funmatricula =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, funcionario.getSenha());
        pstm.setInt(2, funcionario.getMatricula());
        pstm.execute();
        
        /*sql = "update funcionario set fungerfuncionario = ? where funmatricula =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, funcionario.getGerente());
        pstm.setInt(2, funcionario.getMatricula());
        pstm.execute();*/
       
       
        FabricaConexao.fecharConexao();
    
    }
    
    public void deletar(int funmatricula) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "delete from funcionario where funmatricula =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, funmatricula);
        pstm.execute();
        
        FabricaConexao.fecharConexao();
        
    }
    
}
