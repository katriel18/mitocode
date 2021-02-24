package CursoSE.src.cursose;

public class App {

    private String nombre;

    public void saludar(String nombre){
        System.out.println("Hola "+nombre);
    }
    public String despedir(String nombre){
        return nombre;
    }

    public static void main(String[] args) throws Exception {

        App a=new App();
        a.saludar("Katriel");
        String mensaje=a.despedir("katriel");
        System.out.println("Adios "+mensaje);
    
    }
}