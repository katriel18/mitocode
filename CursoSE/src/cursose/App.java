package CursoSE.src.cursose;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {

        // coneccion a una base de datos externa(problemas con la bas de datos local)

        // JDBC driver y base de datos URL
        // final String JDBC_DRIVER = "org.postgresql.Driver";// com.mysql.jdbc.Driver
        // //para web
        final String DB_URL = "jdbc:postgresql://ec2-54-198-73-79.compute-1.amazonaws.com:5432/d41gjcspnpn2nc";// jdbc:mysql://localhost/mitocode
        // credenciales
        final String USER = "lhthnfargkuqik";
        final String PASS = "7a336cd022dfeea622efb3298049c00377fa236f6085a6d4915d4315dcbb0bdd";

        Connection conexion = null;

        try {
            // Class.forName(JDBC_DRIVER);
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("BD conectada!");
            PreparedStatement st = conexion.prepareStatement("INSERT INTO usuarios(nombre,email,prioridad)  VALUES ('katriel','katriel@gmail.com',5)");
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