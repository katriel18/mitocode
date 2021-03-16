package osti.katriel.Hilos.asincrono;

import java.util.concurrent.Callable;

public class CHilo implements Callable<String>{

    @Override
    public String call() throws Exception{
        return "hilo Callable";
    }

    
}
