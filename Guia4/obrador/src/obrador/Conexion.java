package obrador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost/obrador";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Conexion conexion = null;

    private Conexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Driver cargado.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    public static Connection getConexion() {
        Connection connection = null;
        if (conexion == null) {
            conexion = new Conexion();
        }
        try {
            connection = DriverManager.getConnection(URL + "?useLegacyDatetimeCode=false&serverTimezone=UTC" + "&user=" + USER + "&password=" + PASSWORD);
            System.out.println("Conexión exitosa.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de SQL." + ex.getMessage());
        }
        return connection;
    }
}
