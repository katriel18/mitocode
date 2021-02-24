package CursoSE.src.cursose;

public class App {

    private String nombre="Maria";

    public void saludar1(){
        String nombre="Jose";
        System.out.println("Hola "+nombre);
    }
    public void saludar2(){
        System.out.println("Hola "+nombre);
    }

    public static void main(String[] args) throws Exception {

        App a=new App();
        
        a.saludar1();
        a.saludar2();
    
    }
}