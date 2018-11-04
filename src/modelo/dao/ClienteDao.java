
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import modelo.bean.Cliente;
import modelo.conexao.FabricaConexao;

public class ClienteDao {
    
    PreparedStatement pstm;
    Connection conecta;
    ResultSet rs;
    String sql;
    
    //metodo para cadastrar cliente
    public void inserir(Cliente cliente) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        
        sql = "insert into cliente(clicpf, clirg, clinome, cliendereco,clicnh, clinascimento) values (?, ?, ?, ?, ?, ?)";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, cliente.getCpf());
        pstm.setString(2, cliente.getRg());
        pstm.setString(3, cliente.getNome());
        pstm.setString(4, cliente.getEndereco());
        pstm.setString(5, cliente.getCnh());
        pstm.setInt(6, cliente.getNascimento());
        pstm.execute();
          
        FabricaConexao.fecharConexao();
    
    }//fim metodo alterar cliente
    
    //metodo para inserir o nome na tabela cliente
    public void alterar(Cliente cliente) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "update cliente set  clirg=?, clinome=?, cliendereco=?, clicnh=?, clinascimento=?  where clicpf =? ";
        pstm = conecta.prepareStatement(sql);
        
        pstm.setString(1, cliente.getRg());
        pstm.setString(2, cliente.getNome());
        pstm.setString(3, cliente.getEndereco());
        pstm.setString(4, cliente.getCnh());
        pstm.setInt(5, cliente.getNascimento());
        pstm.setString(6, cliente.getCpf());
        pstm.execute();
        System.out.println("Alterado com Sucesso");
        FabricaConexao.fecharConexao();
        
    }//fim do metodo
    
    //metodo para buscar uma cliente no BD
    public Cliente buscarCpf(String cpf) throws SQLException{
        Cliente cliente = null;
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from cliente where clicpf = ?";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, cpf);
        rs = pstm.executeQuery();
        
        if(rs.next()){
            cliente = new Cliente();
            cliente.setCpf(rs.getString("clicpf"));
            cliente.setRg(rs.getString("clirg"));
            cliente.setNome(rs.getString("clinome"));
            cliente.setEndereco(rs.getString("cliendereco"));
            cliente.setCnh(rs.getString("clicnh"));
            cliente.setNascimento(rs.getInt("clinascimento"));
        }
        FabricaConexao.fecharConexao();
        
        return cliente;
    }
    
    public void deletar(String cpf) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "delete from cliente where clicpf =? ";
        pstm = conecta.prepareStatement(sql);
        pstm.setString(1, cpf);
        pstm.execute();
        
        FabricaConexao.fecharConexao();
        
    }//fim metodo excluir cliente
    
    public List<Cliente> listar() throws SQLException{                  
        List<Cliente> lista = new ArrayList<>();
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from cliente order by clinome ";
        pstm = conecta.prepareStatement(sql);
        rs = pstm.executeQuery();
        
        while(rs.next()){
            Cliente cliente = new Cliente();
            cliente.setCpf(rs.getString("clicpf"));
            cliente.setNome(rs.getString("clinome"));
            cliente.setRg(rs.getString("clirg"));
            cliente.setCnh(rs.getString("clicnh"));
            cliente.setNascimento(rs.getInt("clinascimento"));
            cliente.setEndereco(rs.getString("cliendereco"));
            lista.add(cliente);
        }
        
        FabricaConexao.fecharConexao();
        return lista;
    }// fim do metodo listar  

    public List<Cliente> buscar(String busca) throws SQLException{
        conecta = FabricaConexao.conexaoBanco();
        sql = "select * from cliente where clicpf = '%"+busca+"%' or clinome like '%"+busca+"%' or clirg like '%"+busca+"%' or clicnh like '%"+busca+"%' or cliendereco like '%"+busca+"%' or clinascimento = '"+busca+"' order by clinome";
        pstm = conecta.prepareStatement(sql);
        //pstm.setString(1, busca);
        //pstm.setString(2, busca);
        rs = pstm.executeQuery();
        List<Cliente> lista = new ArrayList<>();
        while(rs.next()){
            Cliente cliente = new Cliente();
            cliente.setCpf(rs.getString("clicpf"));
            cliente.setNome(rs.getString("clinome"));
            cliente.setRg(rs.getString("clirg"));
            cliente.setCnh(rs.getString("clicnh"));
            cliente.setEndereco(rs.getString("cliendereco"));
            cliente.setNascimento(rs.getInt("clinascimento"));
            lista.add(cliente);
        }
        FabricaConexao.fecharConexao();
        return lista;
    }//fim de lista de pesquisa
    
}//fim clienteDao
