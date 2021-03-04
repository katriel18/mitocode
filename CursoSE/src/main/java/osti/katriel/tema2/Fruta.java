package osti.katriel.tema2;

public class Fruta {
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fruta(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Fruta [nombre=" + nombre + "]";
    }
    
}
