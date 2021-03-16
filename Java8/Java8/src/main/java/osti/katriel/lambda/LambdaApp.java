package osti.katriel.lambda;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

//ENFOQUE DECLARATIVO
public class LambdaApp {


    public void ordenar(){

        List<String> lista=new ArrayList<>();
        lista.add("e");
        lista.add("b");
        lista.add("a");
        lista.add("E");
        lista.add("B");
        lista.add("A");

        //JDK<1.7
/*
        Collections.sort(lista,new Comparator<String>(){    //CLASE ANONIMA

            @Override
            public int compare(String o1, String o2) {
                //return o1.compareTo(o2);
                return o1.compareToIgnoreCase(o2);//IGNORA LAS MAYUSCULAS
            }
            
        });
*/

         //JDK>1.8
        Collections.sort(lista,(String o1, String o2) -> o1.compareToIgnoreCase(o2));   //LAMBDA
        
        for (String elemento : lista) {
            System.out.println(elemento);
        }

    }

    public static void main(String args[]) {
       
        LambdaApp la=new LambdaApp();
        la.ordenar();

    }
}
