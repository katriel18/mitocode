package osti.katriel.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Enfoque imperativo sin lambdas
public class LambdaApp {


    public void ordenar(){

        List<String> lista=new ArrayList<>();
        lista.add("e");
        lista.add("b");
        lista.add("a");

        Collections.sort(lista,new Comparator<String>(){    //Clase Anonima

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
            
        });

        for (String elemento : lista) {
            System.out.println(elemento);
        }

    }

    public static void main(String args[]) {
       
        LambdaApp la=new LambdaApp();
        la.ordenar();

    }
}
