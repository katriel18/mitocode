package osti.katriel.Hilos.asincrono;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class HilosApp {

    public static void main(String args[]) throws InterruptedException, ExecutionException {

        ExecutorService executor=Executors.newFixedThreadPool(2);
        //Muestra los resultado a medida que los hilos van terminando su ejecucion
        ExecutorCompletionService<String> completeService=new  ExecutorCompletionService<>(executor);
        Future<String> task1=completeService.submit(new CHilo(3000));
        Future<String> task2=completeService.submit(new CHilo(2000));
        
        while (true) {
            System.out.println(completeService.take().get());
        }
       
    }

}
