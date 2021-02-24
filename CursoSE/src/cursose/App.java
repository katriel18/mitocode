package CursoSE.src.cursose;

public class App {
    public static void main(String[] args) throws Exception {

        String texto="Hola Katriel";

        char caracter=texto.charAt(0);
        System.out.println(caracter);

        int negativo1=texto.compareTo("Hola Osti");
        System.out.println(negativo1);

        int negativo2=texto.compareTo("hola katriel");
        System.out.println(negativo2);

        int positivo1=texto.compareTo("Hola Katriel");
        System.out.println(positivo1);

        String resultado=texto.concat("...");
        System.out.println(resultado);

        boolean resultado3=texto.contains("o");
        System.out.println(resultado3);

        int pos=texto.indexOf("i");
        System.out.println(pos);
        int pos2=texto.indexOf("a");
        System.out.println(pos2);

        String parte=texto.substring(5);
        System.out.println(parte);    
    
        int cant=texto.length();
        System.out.println(cant); 
    
    }
}
