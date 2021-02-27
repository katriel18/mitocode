package CursoSE.src.cursose;

import java.sql.*;

public class App {

    public static void main(String[] args) {

        final String DB_URL = "jdbc:postgresql://localhost:5432/mitocode";

        final String USER = "postgres";
        final String PASS = "postgres";

        // finally de manera implicita - cierra recursos de manera automatica
        try (Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);) {

            System.out.println("BD conectada!");
            PreparedStatement st = conexion.prepareStatement("INSERT INTO persona(nombre) VALUES ('Juan')");
            st.executeUpdate();
            st.close();

        } catch (SQLException e) {

            System.out.println("Exepcion 1 ejecutada: " + e.getMessage());

        }

    }

}