package obrador;

import java.util.Scanner;

/*
 * @author Abigail Castro
 */
public class SQLQueryBuilder {

    static Scanner scanner = new Scanner(System.in);

    static private String nombreTabla;
    static private int cantidadColumnas;
    static String[] columna;
    static Object[] valores;
            
    public static void setNombreTabla(String nombreTabla) {
        SQLQueryBuilder.nombreTabla = nombreTabla;
    }

    public static void setCantidadColumnas(int cantidadColumnas) {
        SQLQueryBuilder.cantidadColumnas = cantidadColumnas;
        columna = new String[cantidadColumnas];
        valores = new Object[cantidadColumnas];
    }
    
    public static String buildInsertQuery() {

        StringBuilder query = new StringBuilder("INSERT INTO " + nombreTabla + " (");

        for (int i = 0; i < columna.length; i++) {
            System.out.println("Nombre de la columna: ");
            columna[i] = scanner.nextLine();
            query.append(columna[i]);
            if (i < cantidadColumnas - 1) {
                query.append(",");
            }
        }
        query.append(") VALUES (");

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor para la columna " + columna[i] + ":");
            valores[i] = scanner.nextLine();
            if (valores[i] instanceof String) {
                query.append("'").append(valores[i]).append("'");
            }
            if (i < valores.length - 1) {
                query.append(",");
            }
        }

        query.append(")");

        System.out.println(query.toString());
        return query.toString();
    }

    static String buildUpdateQuery(String nombreTabla, int cantidadColumnas) {

        StringBuilder query = new StringBuilder("UPDATE " + nombreTabla + " SET ");

        System.out.println("¿Cuántos datos va a modificar?");
        int cantidadDatos = scanner.nextInt();
        for (int i = 0; i < cantidadDatos; i++) {
            System.out.println("Valor para la columna " + columna[i] + ":");
            valores[i] = scanner.nextLine();
            query.append(columna[i]).append(" = ").append("'").append(valores[i]).append("'");
            if (i < columna.length - 1) {
                query.append(",");
            }
        }

        System.out.println("Ingrese una condición WHERE (opcional): ");
        String condicion = scanner.nextLine();
        if (condicion != null && !condicion.isEmpty()) {
            query.append(" WHERE ").append(condicion);
        }
        System.out.println(query.toString());
        return query.toString();
    }
}
