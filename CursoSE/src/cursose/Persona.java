package CursoSE.src.cursose;

public class Persona {
    
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarInstancia() {
        System.out.println(this.nombre+" "+this.edad);
    }

    public static void mostrarClase() {
        System.out.println("metodo estatico");
    }
}
