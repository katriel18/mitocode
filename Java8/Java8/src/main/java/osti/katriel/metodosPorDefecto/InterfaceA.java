package osti.katriel.metodosPorDefecto;

public interface InterfaceA {

    public void caminar();

    default public void hablar(){
        System.out.println("Hablando    A");
    }

    default public void hablar2(){
        System.out.println("Hablando    A2");
    }

}