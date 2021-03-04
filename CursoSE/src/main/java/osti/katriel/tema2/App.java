package osti.katriel.tema2;

public class App {
    public static void main(String[] args) {
        String texto="Texto";
        Integer n1=10;
        if(texto instanceof String){
            System.out.println("Es un String");
        }
        System.out.println("texto".getClass());
        System.out.println(n1.getClass());
    }
}
