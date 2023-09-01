package obrador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            /*String sql = "INSERT INTO herramienta (nombre, descripcion, stock, estado)"
                    + " VALUES ('Destornillador', 'Destornillador plano Robust',11 , 1),"
                    + "('Juego Allen', 'Set de llaves Allen x12', 15, 1)";
            PreparedStatement ps = con.prepareStatement(sql);
            int reg = ps.executeUpdate();
            System.out.println("Filas afectadas: " + reg);
            */
            
            /*String select = "SELECT * FROM herramienta WHERE stock > 10";
            PreparedStatement ps = con.prepareStatement(select);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Id Herramienta: " + rs.getInt("idHerramienta"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Descripción: " + rs.getString("descripcion"));
                System.out.println("Stock: " + rs.getInt("stock"));
                System.out.println("Estado: " + rs.getBoolean("estado"));
                System.out.println("-----------------------------------------------");
            }*/
            
            String update = "UPDATE empleado SET estado ='false' WHERE idEmpleado = 1";
            PreparedStatement ps = con.prepareStatement(update);
            int reg = ps.executeUpdate();
            System.out.println("Filas afectadas: " + reg);
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error de Driver." + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de SQL." + ex.getMessage());
        }
    }

}
