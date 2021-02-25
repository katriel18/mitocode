package CursoSE.src.cursose;

public class Celular {

    public String nombre;
    private String color;
    protected String serie;
    String fecha;

    public Celular() {
        System.out.println("Soy un constructor vacio.");
    }
    public Celular(String nombre) {
        this.nombre = nombre;
    }

    public Celular(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    
    public void llamar(){
        System.out.println(nombre+"-"+color+" esta llamando...");
    }

    public void llamadaEspecial(Celular c){
        System.out.println(c.nombre+"-"+c.color+" esta llamando...");
    }
    
}
