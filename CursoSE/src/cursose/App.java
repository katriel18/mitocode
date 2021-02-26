package CursoSE.src.cursose;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws ExcepcionPersonalizada {

        final int EDAD_MAXIMA = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");

        int edad = sc.nextInt();

        if (edad < EDAD_MAXIMA) {
            System.out.println("Bienvenido");
        } else {

            throw new ExcepcionPersonalizada("Edad no permitida");

        }

    }
}