package CursoSE.src.cursose;

import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {

   
        List<Integer> lista =new LinkedList<>();

        lista.add(11);//indice 0
        lista.add(22);//indice 1
        lista.add(33);//indice 2

        System.out.println("Size: "+lista.size());
        System.out.println(lista.get(1));

    }
}