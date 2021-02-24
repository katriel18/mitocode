package CursoSE.src.cursose;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int cant = 5;
        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[cant];
        // int[] edades = new int[cant];

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese nombre " + i + ":");
            nombres[i] = sc.next();
            // System.out.println("Ingrese edad " + i + ":");
            // edades[i] = sc.nextInt();
        }

        System.out.println("--------------------------");

        String aux;

        for (int i = 0; i < cant - 1; i++) {
            for (int j = 0; j < (cant - 1) - i; j++) {
                if (nombres[j].compareTo(nombres[j + 1]) > 0) {          //orden ascendente
                    //if (nombres[j].compareTo(nombres[j + 1]) < 0) {   //orden descendente
                    aux = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = aux;
                }

            }
        }

        for (String e : nombres) {
            System.out.println(e);
        }

    }
}