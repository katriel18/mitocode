package CursoSE.src.cursose;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        Set<Integer> conjunto =new HashSet<>();//numeros si ordena bien

        conjunto.add(4);
        conjunto.add(4);
        conjunto.add(5);
        conjunto.add(6);
        conjunto.add(7);
        conjunto.add(7);

        for (Integer c : conjunto) {
           System.out.println(c);
        }
        System.out.println("-----------------------");
        Set<String> conjunto2 =new HashSet<>();//numeros en texto si ordena bien
        conjunto2.add("4");
        conjunto2.add("4");
        conjunto2.add("Zorro");
        conjunto2.add("Alan");
        conjunto2.add("Jhon");
        conjunto2.add("Jhon");

        for (String c : conjunto2) {
           System.out.println(c);
        }

    }
}