
package modelo.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
   
    private static String url = "jdbc:mysql://localhost:3306/locacao";
    private static String usuario = "root";
    private static String senha = "";
    private static Connection conexao = null;

    public static Connection conexaoBanco(){
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexao realizada com sucesso!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Arquivo nao encontrado: "+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Ops... Usuario ou senha invalidos! Tente novamente."+ex.getMessage());
        }
                
        return conexao;
    }
    
    public static void fecharConexao(){
        try{
            conexao.close();
           // System.out.println("Conexao fechada.");
        }catch (SQLException ex){
            System.out.println("Erro ao fechar conexao"+ex.getMessage());
        }
    }
    
    //public static void main(String[] args) {
      //  FabricaConexao fab = new FabricaConexao();
        //fab.conexaoBanco();
    //}
    
}
