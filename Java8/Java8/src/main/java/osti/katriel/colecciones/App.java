package osti.katriel.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

    private List<String> lista=new ArrayList<>();

    public void llenarLista(){
        lista.add("e");
        lista.add("a");
        lista.add("r");
    }

    public void usarForEach(){

        //1er forma
        for (String x : lista) {
            System.out.print(x);
        }

        //2da forma
        lista.forEach((x)->System.out.print(x));

        //3ra forma
        lista.forEach(System.out::print);

    }

    public void usarRemoveIf(){

        //1er forma
        Iterator<String> x=lista.iterator();
        while(x.hasNext()){
            if(x.next().equalsIgnoreCase("e")){
                x.remove();
            }
        }

        //2da forma
        lista.removeIf((y)->y.equalsIgnoreCase("a"));

    }

    public static void main(String args[]) {

        App a=new App();
        a.llenarLista();

        //a.usarForEach();

        a.usarRemoveIf();
        a.usarForEach();

    }


}
