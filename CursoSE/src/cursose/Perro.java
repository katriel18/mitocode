package CursoSE.src.cursose;

public class Perro implements Animal, SerVivo {

    @Override
    public void mostrarTipoDeAnimal() {
        System.out.println("Soy un mamifero");
    }

    @Override
    public String mostrarNombre() {
        return "mamifero";
    }

    @Override
    public void mostrarVida() {
        System.out.println("Estoy vivo");

    }
    
}
