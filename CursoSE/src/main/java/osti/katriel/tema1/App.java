package osti.katriel.tema1;

//Compilar: mvn compile 
//Crear JAR: mvn package
//Ir a target: java -cp CursoSE-1.0.jar osti.katriel.tema1.App

public class App {
    public static void main(String[] args) {
        Alumno a1 = new Alumno();
        System.out.println(a1.sumar(2));
    }
}
