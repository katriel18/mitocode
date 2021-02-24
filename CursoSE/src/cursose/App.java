package CursoSE.src.cursose;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Inrese tamaño del vector:");

        Scanner sc = new Scanner(System.in);
        int tamano = sc.nextInt();
        String[] vector = new String[tamano];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese valor " + i + ":");
            vector[i] = sc.next();
        }

        System.out.println("--------------------------");

        for (String cadena : vector) {
            System.out.println(cadena);
        }
        
    }
}