
package util;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JComboBox;
import modelo.bean.Marca;
import modelo.dao.MarcaDao;


public class Utilitarios {
    
    
   public static void listarMarca(JComboBox combo){
        try {
            List<Marca> lista = new MarcaDao().listar();
            for (Marca marca : lista){
                combo.addItem(marca);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar: " + ex.getMessage());
        }
        
    }
}
