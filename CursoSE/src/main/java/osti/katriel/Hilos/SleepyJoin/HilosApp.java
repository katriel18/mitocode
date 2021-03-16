package osti.katriel.Hilos.SleepyJoin;

public class HilosApp {

    //Hilo Principal
    public static void main(String args[]) throws InterruptedException {

        //Hilo con Thread
        THilo h1=new THilo(1);
        h1.start();

        //Hilo con Runneable //Recomendable menos Dependiente
        Thread h2=new Thread(new RHilo(2));
        Thread.sleep(3000); //Duerme la ejecucion del hilo y el programa
        h2.start();

        //Hilo con Clase Anonima
        Runnable AHilo=new Runnable(){
            @Override
            public void run(){
                    System.out.println("Hilo Anonimo");
            }
        };
        Thread h3=new Thread(AHilo);
        h3.start();

        //Hilo Principal
        System.out.println("Hilo Principal");
       

    }

}
