package osti.katriel.metodosPorDefecto;

public class App implements InterfaceA, InterfaceB{

    @Override
    public void caminar() {
        System.out.println("Caminando!");
    }
    
    //Si hay dos clases con el mismo metodo se tiene que sobreescribir
    @Override
    public void hablar() {
        InterfaceA.super.hablar();
        InterfaceB.super.hablar();//opcional
    }
    
    public static void main(String args[]) {
        App a=new App();
        a.caminar();
        a.hablar();
        a.hablar2();
    }

}
