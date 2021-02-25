package CursoSE.src.cursose;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        Map<String,String> diccionario =new HashMap<>();

        diccionario.put("uno", "1");
        diccionario.put("dos", "2");
        diccionario.put("tres", "3");

        String contenido=diccionario.get("tres");
        
        System.out.println(contenido);

    }
}