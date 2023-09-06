package obrador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Scanner;

/*
 * @author Abigail Castro
 */
public class Obrador {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        connection = Conexion.getConexion();

        insertQuery(connection, ps);
        //updateQuery(connection, ps);
    }

    private static void obtenerDatos() {
        System.out.println("Ingrese el nombre de la tabla a trabajar");
        SQLQueryBuilder.setNombreTabla(scanner.next());
        System.out.println("Ingrese la cantidad de columnas");
        SQLQueryBuilder.setCantidadColumnas(scanner.nextInt());
    }

    private static void insertQuery(Connection connection, PreparedStatement ps) {
        try {
            obtenerDatos();
            String insertQuery = SQLQueryBuilder.buildInsertQuery();
            ps = connection.prepareStatement(insertQuery);
            int filasAfectadas = ps.executeUpdate();
            System.out.println("Filas afectadas: " + filasAfectadas);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. " + ex.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    private static void updateQuery(Connection connection, PreparedStatement ps){
        try {
            obtenerDatos();
            String updateQuery = SQLQueryBuilder.buildUpdateQuery();
            ps = connection.prepareStatement(updateQuery);
            int filasAfectadas = ps.executeUpdate();
            System.out.println("Filas afectadas: " + filasAfectadas);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. " + ex.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
