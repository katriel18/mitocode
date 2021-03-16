package osti.katriel.Hilos.SleepyJoin;

public class HilosApp {

    //Hilo Principal
    public static void main(String args[]) throws InterruptedException {

        //Hilo con Thread
        THilo h1=new THilo(1);
        h1.start();
        h1.join();//Tiene que morir el hilo para que se ejecute otro

        //Hilo con Runneable //Recomendable menos Dependiente
        Thread h2=new Thread(new RHilo(2));
        h2.start();
        h2.join();

        //Hilo con Clase Anonima
        Runnable AHilo=new Runnable(){
            @Override
            public void run(){
                    System.out.println("Hilo Anonimo");
            }
        };
        Thread h3=new Thread(AHilo);
        h3.start();
        h3.join();

        //Hilo Principal
        System.out.println("Hilo Principal");
       
    }

}
