package CursoSE.src.cursose;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String resultado = sc.next();

        switch (resultado) {
            case "Osti":
                System.out.println("Hola Osti");
                break;
            case "Katriel":
                System.out.println("Hola Katriel");
                break;
            default:
                System.out.println("No encontrado");
                break;
        }
        System.out.println("Fin del Switch");

    }
}