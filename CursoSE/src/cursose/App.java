package CursoSE.src.cursose;

public class App {

    private String nombre;

    public void saludar(){
        nombre="Katriel";
        System.out.println("Hola "+nombre);
    }

    public static void main(String[] args) throws Exception {

        App a=new App();
        a.saludar();
    
    }
}