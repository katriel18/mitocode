package CursoSE.src.cursose;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int cant = 3;
        Scanner sc = new Scanner(System.in);

        int[][] numeros = new int[cant][cant];

        for (int i = 0; i < cant; i++) {
            for (int j = 0; j < cant; j++) {
                System.out.println("Ingrese numero " + i + "," + j + ": ");
                numeros[i][j] = sc.nextInt();
            }
        }

        System.out.println("-------------------");

        for (int i = 0; i < cant; i++) {
            for (int j = 0; j < cant; j++) {
                    if(i==j){
                        System.out.print(numeros[i][j]);
                    }else{
                        System.out.print(0);
                    }
            }
            System.out.println();
        }

    }
}