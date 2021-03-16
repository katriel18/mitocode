package osti.katriel.metodosPorDefecto;

public class App implements InterfaceA{

    @Override
    public void caminar() {
        System.out.println("Caminando...");
    }
    
    public static void main(String args[]) {
        App a=new App();
        a.caminar();
        a.hablar();
        a.hablar2();
    }

}
