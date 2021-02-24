package CursoSE.src.cursose;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String nombre = "";
        Scanner input = new Scanner(System.in);

        nombre = input.nextLine();
        while (!nombre.equals("Osti")) {//respeta mayus y minus
            System.out.println("No eres Osti");
            nombre = input.nextLine();
        }

        System.out.println("Hola " + nombre);

    }
}
