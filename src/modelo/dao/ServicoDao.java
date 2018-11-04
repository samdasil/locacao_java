
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.bean.Servico;
import modelo.conexao.FabricaConexao;

public class ServicoDao {
    
    PreparedStatement pstm;
    Connection conecta;
    ResultSet rs;
    String sql;
    
    public void inserir (Servico servico) throws SQLException{
        
        conecta= FabricaConexao.conexaoBanco();
        sql = "insert into servico(serdescricao) values (?)";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, servico.getDescricao());
        pstm.execute();
        FabricaConexao.fecharConexao();
        
    }
    
    public Servico buscarCodigo(int sercodigo) throws SQLException{
        Servico servico = null;
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from servico where sercodigo = ?";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, sercodigo);
        rs = pstm.executeQuery();
        
        if(rs.next()){
            servico = new Servico();
            servico.setCodigo(rs.getInt("sercodigo"));
            servico.setDescricao(rs.getString("serdescricao"));
        }
        FabricaConexao.fecharConexao();
        
        return servico;
    }//fim de pesquisar servico
    
    public void alterar(Servico servico) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "update servico set serdescricao= ? where sercodigo =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, servico.getDescricao());
        pstm.setInt(2, servico.getCodigo());
        pstm.execute();
        FabricaConexao.fecharConexao();
        
    }
    
    public void deletar(int sercodigo) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "delete from servico where sercodigo =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setInt(1, sercodigo);
        pstm.execute();
        FabricaConexao.fecharConexao();
        
    }
    
    public List<Servico> listar() throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from servico";
        pstm = conecta.prepareStatement(sql);
        rs = pstm.executeQuery();
        List<Servico> lista = new ArrayList<>();
        while(rs.next()){
            Servico servico = new Servico();
            servico.setCodigo(rs.getInt("sercodigo"));
            servico.setDescricao(rs.getString("serdescricao"));
            lista.add(servico);
        }
        
        FabricaConexao.fecharConexao();
        return lista;
    }//fim de lista

    public List<Servico> buscar(String busca) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from servico where sercodigo = '"+busca+"' or serdescricao like '%"+busca+"%' order by serdescricao";
        pstm = conecta.prepareStatement(sql);
        //pstm.setString(1, busca);
        //pstm.setString(2, busca);
        rs = pstm.executeQuery();
        List<Servico> lista = new ArrayList<>();
        while(rs.next()){
            Servico servico = new Servico();
            servico.setCodigo(rs.getInt("sercodigo"));
            servico.setDescricao(rs.getString("serdescricao"));
            lista.add(servico);
        }
        FabricaConexao.fecharConexao();
        return lista;
    }//fim de lista de pesquisa
    
}//fim servicoDao
