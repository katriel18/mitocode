package osti.katriel.tema2;

public class App {
    public static void main(String[] args) {
        Alumno a=new Alumno();
        
        if(a instanceof Alumno){
            System.out.println("Es una Alumno");
        }else if(a instanceof Persona){
            System.out.println("Es una Persona");
        }
        

        
        
    }
}
