package obrador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * @author Abigail Castro
 */
public class Obrador {

    public static void main(String[] args) {
        try {
            //Cargar Driver
            Class.forName("org.mariadb.jdbc.Driver");
            //Conectar a Base de datos
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/obrador", "root", "");
            System.out.println("Conexión exitosa.");
            
            //insertar datos a la tabla
            String sql = "INSERT INTO herramienta (nombre, descripcion, stock, estado)"
                    + " VALUES ('', '', , ), ('', '', , ),"
                    + "('', '', , )";
            PreparedStatement ps = con.prepareStatement(sql);
            int reg = ps.executeUpdate();
            System.out.println("Filas afectadas: " + reg);
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error de Driver." + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de SQL." + ex.getMessage());
        }
    }

}
