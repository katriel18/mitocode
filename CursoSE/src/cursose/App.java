package CursoSE.src.cursose;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int cant = 5;
        Scanner sc = new Scanner(System.in);

        // String[] nombres= new String[cant];
        int[] edades = new int[cant];

        for (int i = 0; i < cant; i++) {
            // System.out.println("Ingrese nombre " + i + ":");
            // nombres[i] = sc.next();
            System.out.println("Ingrese edad " + i + ":");
            edades[i] = sc.nextInt();
        }

        System.out.println("--------------------------");

        int aux;

        for (int i = 0; i < cant - 1; i++) {
            for (int j = 0; j < (cant - 1) - i; j++) {
                if (edades[j] > edades[j + 1]) {
                    aux = edades[j];
                    edades[j] = edades[j + 1];
                    edades[j + 1] = aux;
                }

            }
        }

        for (Integer e : edades) {
            System.out.println(e);
        }

    }
}