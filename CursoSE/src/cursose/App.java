package CursoSE.src.cursose;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

    public static void main(String[] args) {

   
        Long i1=System.nanoTime();
        List<Integer> lista =new ArrayList<>();

        lista.add(1); //1 procesador 1 bloque
        lista.add(2); //1 procesador 1 bloque
        lista.add(3); //1 procesador 1 bloque
        lista.add(4); //1 procesador 1 bloque
        lista.add(5); //1 procesador 1 bloque
        Long f1=System.nanoTime();
        System.out.println(f1-i1);//[38001-41400]

        /////////////////////////////////////////
        
        Long i2=System.nanoTime();
        List<Integer> lista2 =new ArrayList<>(5);

        //1 procesador 5 bloques
        lista2.add(1); //a cada bloque
        lista2.add(2); //a cada bloque
        lista2.add(3); //a cada bloque
        lista2.add(4); //a cada bloque
        lista2.add(5); //a cada bloque
        Long f2=System.nanoTime();
        System.out.println(f2-i2);//[4100-4900]

    }
}