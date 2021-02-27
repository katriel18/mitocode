package CursoSE.src.cursose;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {

        final String DB_URL = "jdbc:postgresql://localhost:5432/mitocode";

        final String USER = "postgres";
        final String PASS = "postgres";

        Connection conexion = null;

        try {

            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("BD conectada!");
            PreparedStatement st = conexion.prepareStatement("INSERT INTO persona(nombre) VALUES ('Juan')");
            st.executeUpdate();
            st.close();

        } catch (SQLException e) {

            System.out.println("Exepcion 1 ejecutada: " + e.getMessage());

        } finally {

            if (conexion != null) {
                try {

                    if (!conexion.isClosed())
                        conexion.close();

                } catch (SQLException e) {

                    System.out.println("Exepcion 2 ejecutada: " + e.getMessage());

                }
            }

        }

    }
}