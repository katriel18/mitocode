package osti.katriel.Hilos.Synchronized;

/**
 * App
 */
public class App {

    public static void main(String args[]) throws InterruptedException {
    
        //Hilo con Clase Anonima
        Runnable AHilo=new Runnable(){

            @Override
            public void run(){

                PaisDAOImpl dao=PaisDAOImpl.getInstance();

                for (Pais pais : dao.getPaises()) {
                    System.out.println(pais.getNombre());
                }
                   
            }

        };

        Thread h1=new Thread(AHilo);
        h1.start();
        Thread h2=new Thread(AHilo);
        h2.start();

    }
}