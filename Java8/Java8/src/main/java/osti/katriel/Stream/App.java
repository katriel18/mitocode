package osti.katriel.Stream;

import java.util.ArrayList;
import java.util.List;

public class App {

    private List<String> nombres;
    private List<String> numeros;

    public App() {
        this.nombres = new ArrayList<>();
        this.nombres.add("a");
        this.nombres.add("z");
        this.nombres.add("b");
        this.nombres.add("A");
        this.numeros = new ArrayList<>();
        this.numeros.add("3");
        this.numeros.add("1");
        this.numeros.add("7");
    }

    public void filtrar(){
        this.nombres.stream().filter((x)->x.startsWith("a")).forEach(System.out::println);
    }
    public void ordenar(){
        //this.nombres.stream().sorted().forEach(System.out::println);
        this.nombres.stream().sorted((x,y)->y.compareToIgnoreCase(x)).forEach(System.out::println);
    }
    public void transformar(){
        this.nombres.stream().map(String::toUpperCase).forEach(System.out::println);

        this.numeros.stream().map((x)->Integer.parseInt(x)+1).forEach(System.out::println);
    }
    public void limitar(){
        this.nombres.stream().limit(2).forEach(System.out::println);
    }
    public void contar(){
        Long l=this.nombres.stream().count();
        System.out.println(l);
    }

    public static void main(String args[]) {
        App a=new App();

        //a.filtrar();
        //a.ordenar();
        //a.transformar();
        //a.limitar();
        a.contar();
    }


}