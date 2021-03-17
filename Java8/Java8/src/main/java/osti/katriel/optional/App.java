package osti.katriel.optional;

import java.util.Optional;

public class App {

    //Optional vacio
    public void probar(String valor) {
        //System.out.println(valor.contains("katriel"));  //NullPointerException

        try{
        
            Optional<String> o=Optional.empty();
            System.out.println(o.get());//NoSuchElementException //Si se no le asigana nada

        }catch(Exception e){
            System.out.println("No esta inicializado: "+e);
        }

    }

    //Optional inicializado
    public void of(String valor) {
        try{
        
            Optional<String> o=Optional.of(valor);//no acepta nulos
            System.out.println(o.get());//NullPointerException //Si se le pasa null
    
        }catch(Exception e){
            System.out.println("Se paso un valor nulo: "+e);
        }

    }

    //Devuelve un valor por defecto
    public void orElse(String valor) {
        Optional<String> o=Optional.ofNullable(valor);//Acepta nulos
        System.out.println(o.orElse("valor por defecto"));
    }

    //Devuelve una excepcion
    public void orElseThrow(String valor) {
        Optional<String> o=Optional.ofNullable(valor);//Acepta nulos
        System.out.println(o.orElseThrow(NumberFormatException::new));
    }

    //Devuelve una true or false
    public void isPresent(String valor) {

        Optional<String> o=Optional.ofNullable(valor);//Acepta nulos
        System.out.println(o.isPresent());
    }

    public static void main(String args[]) {

        App a=new App();

        //a.probar(null);

        //a.of(null);

        //a.orElse(null);

        //a.orElseThrow(null);

        a.isPresent(null);
        
    }

}
