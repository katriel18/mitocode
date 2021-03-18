package osti.katriel.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class App {
    
    private Map<Integer,String> map;

    public void llenar() {
        map=new HashMap<>();
        map.put(1, "Juan");
        map.put(2, "Abel");
        map.put(3, "Carlos");
        map.put(3, "Lenn");//sobreescribe si mandamos el mismo key
    }

    public void imprimir7(){
        for(Entry<Integer,String> e : map.entrySet()){
            System.out.println("Llave: "+e.getKey()+" Valor: "+e.getValue());
        }
    }

    public void imprimir8(){
        //1er forma
        map.forEach((k,v)->System.out.println("Llave: "+k+" Valor: "+v));
        //2da forma
        map.entrySet().stream().forEach(System.out::println);
    }

    public void agregarSiNoExiste(){
        map.putIfAbsent(1, "katriel");
    }

    public void operarSiExiste(){
        map.computeIfPresent(1, (k,v)->k+v);
        System.out.println(map.get(1));
    }

    //Obtiene una valor por defecto si no existe la llave
    public void obtenerPredeterminado(){
        String s=map.getOrDefault(6, "No existe");
        System.out.println(s);
    }

    public void recolectar(){

        Map<Integer,String> mapaRecolectado=map.entrySet().stream()
        .filter(e->e.getValue().contains("en"))
        .collect(Collectors.toMap(x->x.getKey(), y->y.getValue()));

        mapaRecolectado.entrySet().stream().forEach(System.out::println);
    }


    public static void main(String agrs[]) {
        App a=new App();

        a.llenar();

        //a.imprimir7();
        a.agregarSiNoExiste();
        a.imprimir8();

        //a.operarSiExiste();

        a.obtenerPredeterminado();

        a.recolectar();
    }

}
