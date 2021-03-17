package osti.katriel.streamParalelo;

import java.util.ArrayList;
import java.util.List;

public class App {

    private List<Integer> numeros;

    public void llenar(){

        numeros=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numeros.add(i);
        }
    }

    public void probarStream(){
        numeros.stream().forEach(System.out::println);
    }

    //usa hilos para acelerar el proceso
    public void probarStreamParalelo(){
        numeros.parallelStream().forEach(System.out::println);
    }

    public static void main(String args[]) {
        
        App a=new App();
        a.llenar();
        //a.probarStream();
        a.probarStreamParalelo();

    }
}
