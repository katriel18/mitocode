package CursoSE.src.cursose;

public class App {

    public static void main(String[] args) {

        Hilo h1=new Hilo("Hilo 1");
        h1.start();

        Hilo h2=new Hilo("Hilo 2");
        h2.start();

    }
}