package CursoSE.src.cursose;

import java.sql.*;
import java.util.Scanner;

public class App {

    public String solicitarValores() {

        Scanner sc=new Scanner(System.in);
        String nombre =sc.next();
        return nombre;
        
    }
    public void listar() {

        final String DB_URL = "jdbc:postgresql://localhost:5432/mitocode";

        final String USER = "postgres";
        final String PASS = "postgres";

        // finally de manera implicita - cierra recursos de manera automatica
        try (Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);) {

            System.out.println("BD conectada!");
            PreparedStatement st = conexion.prepareStatement("SELECT * FROM persona");
           
            ResultSet rs= st.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id")+" "+rs.getString("nombre"));
            }

            rs.close();
            st.close();

        } catch (SQLException e) {

            System.out.println("Exepcion 1 ejecutada: " + e.getMessage());

        }

    }

    public void registrar(String valor) {

        final String DB_URL = "jdbc:postgresql://localhost:5432/mitocode";

        final String USER = "postgres";
        final String PASS = "postgres";

        // finally de manera implicita - cierra recursos de manera automatica
        try (Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);) {

            System.out.println("BD conectada!");
            PreparedStatement st = conexion.prepareStatement("INSERT INTO persona(nombre) VALUES (?)");
            st.setString(1, valor);
            st.executeUpdate();
            st.close();

        } catch (SQLException e) {

            System.out.println("Exepcion 1 ejecutada: " + e.getMessage());

        }

    }

    public static void main(String[] args) {

        App a=new App();

        a.listar();
        
    }

}