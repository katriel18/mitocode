package CursoSE.src.cursose;

public class App {

    public static void main(String[] args) {

        Animal a = new Perro();
        a.alimentacion();

        a = new Gato();
        a.alimentacion();

        a = new Caballo();
        a.alimentacion();

        a.moverse();

    }
}