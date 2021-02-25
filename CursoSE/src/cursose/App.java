package CursoSE.src.cursose;

public class App {

    public static void main(String[] args) {

        Persona p=new Persona();

        p.setNombre("katriel");
        p.setEdad(22);

        p.mostrarInstancia();//metodo del objeto

        Persona.mostrarClase();//metodo de la clase

    }
}