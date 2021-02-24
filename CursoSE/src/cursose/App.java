package CursoSE.src.cursose;

public class App {
    public static void main(String[] args) throws Exception {

        //caracteres
        char caracter='A';
        System.out.println(caracter);

        Character caracter2='B';
        System.out.println(caracter2);

        Character caracter3=new Character('C');//deprecated
        System.out.println(caracter3);

        //secuencias de escapes
        System.out.println("Hola\nMundo");
        System.out.println("Hola \"Mundo\"");
        System.out.println("Hola \tMundo\"");
        System.out.println("Hola \\Mundo\"");

    }
}
