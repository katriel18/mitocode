package CursoSE.src.cursose;

public class Celular {
    String nombre;
    String color;

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
