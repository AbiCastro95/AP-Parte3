package sistemaulp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * @author Abigail Castro
 */
public class SistemaULP {

    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Class.forName("org.mariadb.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sistemaulp", "root", "");
            /*
            AGREGAR ESTUDIANTES
            String insert = "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado)"
                    + "VALUES (35426782, 'Sosa','Cintia','1997-02-15',1),"
                    + "(38441897, 'Castro','Abigail','1995-06-11',1),"
                    + "(37458961, 'Russo','Daniela','1997-03-02',1)";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.executeUpdate();
            
            AGREGAR MATERIAS
            String insert = "INSERT INTO materia (nombre, año, estado)"
                    + "VALUES ('Ciencias de la comunicación', 1, 1),"
                    + "('Matemática 1', 1, 1),"
                    + "('Estádistica', 2, 1),"
                    + "('Programación 3', 3, 1)";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.executeUpdate();
            
            INSCRIBIR ESTUDIANTES
            String insert = "INSERT INTO `inscripcion`(nota, idAlumno, idMateria)"
                    + "VALUES (8, 1, 1),"
                    + "(null, 1, 4),"
                    + "(9, 2, 2),"
                    + "(null, 2, 3),"
                    + "(8, 3, 4),"
                    + "(null, 3, 1)";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.executeUpdate();
            
            BUSCAR A LOS DE CALIFICACION MAYOR A 8
            String select = "SELECT * FROM inscripcion WHERE nota > 8";
            PreparedStatement ps = con.prepareStatement(select);
            ResultSet resultado = ps.executeQuery();
            
            while(resultado.next()){
                System.out.println("idInscipto " + resultado.getInt("idInscripto"));
                System.out.println("nota " + resultado.getInt("nota"));
                System.out.println("idAlumno " + resultado.getInt("idAlumno"));
                System.out.println("idMateria " + resultado.getInt("idMateria"));
            }
            
            DESINSCRIBIR ESTUDIANTE, eliminado físico.
            String delete = "DELETE FROM inscripcion WHERE idAlumno = 2 AND idInscripto = 4";
            PreparedStatement ps = con.prepareStatement(delete);
            ps.executeUpdate();
            */
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error con el Driver" + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error con SQL" + ex.getMessage());
        }
    }
    
}
