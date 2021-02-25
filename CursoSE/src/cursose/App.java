package CursoSE.src.cursose;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

    public static void main(String[] args) {

   
        List<String> lista =new ArrayList<>();

        lista.add("Hola");
        lista.add("Mundo");
        
        for (String t : lista) {
            System.out.println(t);
        }

        //Objeto Iterator, permite recorrer sobre una lista
        Iterator<String> i=lista.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}