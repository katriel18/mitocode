package CursoSE.src.cursose;

public class App {

    public static void main(String[] args) throws Exception {

        Celular c1=new Celular("LG", "verde");
        Celular c2=new Celular("SAMSUNG", "negro");
        
        c2.llamadaEspecial(c1);
    
    }
}