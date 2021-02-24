package CursoSE.src.cursose;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String opcion;
        do{
            System.out.println("Ingrese su nombre:");
            Scanner sc=new Scanner(System.in);
            opcion=sc.next();

        }while(opcion.equals("Osti"));

    }
}
