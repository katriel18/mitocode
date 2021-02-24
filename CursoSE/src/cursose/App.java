package CursoSE.src.cursose;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input =new Scanner(System.in);

        String nombre=input.nextLine();
        int edad=input.nextInt();

        System.out.println("Hola "+nombre);
        System.out.println("Edad: "+edad);
        
    }
}
