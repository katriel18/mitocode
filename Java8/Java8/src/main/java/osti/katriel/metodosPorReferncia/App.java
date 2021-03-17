package osti.katriel.metodosPorReferncia;

import java.util.Arrays;
import java.util.Comparator;

//No pueden enviar parametros los metodos referenciados
public class App {

    public void operar(){
        Operacion operacion=()->App.referenciarMetodoStatic();
        operacion.saludar();

        Operacion operacion2=App::referenciarMetodoStatic;
        operacion2.saludar();
    }
    public static void referenciarMetodoStatic(){
        System.out.println("Metodo referido Static");
    }

    public void referenciarMetodoInstanciaObjeto(){
        String nombres[]={"Juan","Carlos","Ana"};

        //1er forma
        Arrays.sort(nombres);
        System.out.println(Arrays.toString(nombres));

        //2da forma
        Arrays.sort(nombres,new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(nombres));

        //3er forma
        Arrays.sort(nombres,(o1,o2)->o1.compareToIgnoreCase(o2));
        System.out.println(Arrays.toString(nombres));

        //4ta forma
        Arrays.sort(nombres,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(nombres));


    }

    public void referenciarMetodoInstanciaObjetoParticular(){
        System.out.println("Metodo referido de instancia de objeto");
    }

    


    public static void main(String args[]) {
       
        App a=new App();

        //a.operar();

        //a.referenciarMetodoInstanciaObjeto();

        Operacion operacion=a::referenciarMetodoInstanciaObjetoParticular;
        operacion.saludar();

    }
    
}
