
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.bean.Funcionario;
import modelo.conexao.FabricaConexao;

public class FuncionarioDao {
    
    PreparedStatement pstm;
    Connection conecta;
    ResultSet rs;
    String sql;
    
    public void inserir(Funcionario funcionario) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "insert into funcionario(funmatricula, funnome, funlogin, funsenha, fungerente) values (?, ?, ?, ?, ?)";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, funcionario.getMatricula());
        pstm.setString(2, funcionario.getNome());
        pstm.setString(3, funcionario.getLogin());
        pstm.setString(4, funcionario.getSenha());
//        pstm.setInt(5, funcionario.getGerente());
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
    
    public List<Funcionario> listar() throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from funcionario";
        pstm = conecta.prepareStatement(sql);
        rs = pstm.executeQuery();
        List<Funcionario> lista = new ArrayList<>();
        while(rs.next()){
            Funcionario funcionario = new Funcionario();
            funcionario.setMatricula(rs.getInt("funmatricula"));
            funcionario.setNome(rs.getString("funnome"));
            funcionario.setLogin(rs.getString("funlogin"));
            funcionario.setSenha(rs.getString("funsenha"));
            //funcionario.setGerente(rs.getInt("fungerente"));
            lista.add(funcionario);
        }
        
        FabricaConexao.fecharConexao();
        return lista;
    }//fim de lista 
    
    public void validarLogin(){
        
    }//fim do método validarLogin
    
    
}
