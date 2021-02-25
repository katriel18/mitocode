package CursoSE.src.cursose;

public class App {

    public static void main(String[] args) throws Exception {

        Celular c1=new Celular();

        //no se puede acceder a atributos privados
        c1.nombre="se accede al nombre (public)";
        c1.serie="se accede a la serie (protected)";
        c1.fecha="se accede a la fecha (package)";
    }
}