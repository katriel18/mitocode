package osti.katriel.Hilos.asincrono;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class HilosApp {

    public static void main(String args[]) throws InterruptedException, ExecutionException {

        ExecutorService executor=Executors.newFixedThreadPool(2);
        Future<String> task1=executor.submit(new CHilo());
        Future<?> task2=executor.submit(new RHilo());
        
        while (!task1.isDone() && !task2.isDone()) {
            
        }

        System.out.println(task1.get());
        System.out.println(task2.get());
    }

}
