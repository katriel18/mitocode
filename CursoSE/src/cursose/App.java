package CursoSE.src.cursose;

public class App {

    public static void main(String[] args) throws Exception {

        Celular c1=new Celular();
        Celular c2=new Celular("SAMSUNG");
        Celular c3=new Celular("LG", "verde");
        
        c1.llamar();
        c2.llamar();
        c3.llamar();
    }
}