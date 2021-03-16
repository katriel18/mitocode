package osti.katriel.Hilos.ThreadyRunnable;

public class HilosApp {

    //Hilo Principal
    public static void main(String args[]) {

        //Hilo con Thread
        THilo h1=new THilo(1);
        h1.start();

        //Hilo con Runneable //Recomendable menos Dependiente
        Thread h2=new Thread(new RHilo(2));
        h2.start();

        //Hilo con Clase Anonima
        Runnable AHilo=new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < 100; i++) {
                    System.out.println(i+".Hilo 3");
                }
            }
        };
        Thread h3=new Thread(AHilo);
        h3.start();

        //Bucle del Hilo Principal
        for (int i = 0; i < 100; i++) {
            System.out.println(i+".Hilo Principal");
        }

    }

}
