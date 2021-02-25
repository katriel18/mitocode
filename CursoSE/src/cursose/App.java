package CursoSE.src.cursose;

public class App {

    public static void main(String[] args) throws Exception {

        //Animal a=new Animal();
        
        Perro p1=new Perro();
        p1.setEdad(15);
        p1.mostrar();

        Perro p2=new Perro("Michi","galleta",15,"felino");
        p2.mostrar();
    }
}