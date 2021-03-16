package osti.katriel.Hilos.asincrono;

import java.util.concurrent.Callable;

public class CHilo implements Callable<String>{

    private int segundos;
    
    public CHilo(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String call() throws Exception{
        Thread.sleep(segundos);
        return "hilo Callable";
    }

}
