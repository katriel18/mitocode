package osti.katriel.metodosPorDefecto;

/**
 * InterfaceA
 */
public interface InterfaceA {

    public void caminar();

    default public void hablar(){
        System.out.println("Hablando1...");
    }

    default public void hablar2(){
        System.out.println("Hablando2...");
    }

}