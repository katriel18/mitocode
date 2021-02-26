package CursoSE.src.cursose;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {

        // JDBC driver y base de datos URL
        // final String JDBC_DRIVER = "org.postgresql.Driver";// com.mysql.jdbc.Driver
        final String DB_URL = "jdbc:postgresql://localhost:5432/mitocode";// jdbc:mysql://localhost/mitocode
        // credenciales
        final String USER = "postgres";
        final String PASS = "postgres";

        Connection conexion = null;

        try {
            // Class.forName(JDBC_DRIVER);
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("BD conectada!");
           //PreparedStatement st = conexion.prepareStatement("INSERT INTO persona (nombre) VALUES ('maria')");
            PreparedStatement st = conexion.prepareStatement("INSERT INTO usuario VALUES ('')");
            st.executeUpdate();
            st.close();
            /*
             * } catch (ClassNotFoundException e) {
             * 
             * System.out.println("Exepcion 1 ejecutada!"); e.printStackTrace();
             */
        } catch (SQLException e) {

            System.out.println("Exepcion 2 ejecutada!");
            e.printStackTrace();

        } finally {

            if (conexion != null) {
                try {
                    if (!conexion.isClosed()) {
                        conexion.close();
                    }
                } catch (SQLException e) {
                    System.out.println("Exepcion 3 ejecutada!");
                    e.printStackTrace();
                }
            }

        }

    }
}