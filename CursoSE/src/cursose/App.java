package CursoSE.src.cursose;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        //ArryList = get
        //Linkedlist= add / remove
        
        System.out.println("ADD:");
        System.out.println("LinkedList:");
        Long i1 = System.nanoTime();
        List<Integer> LinkedList = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            LinkedList.add(i);//+
        }
        Long f1 = System.nanoTime();
        System.out.println(f1 - i1);

        System.out.println("ArrayList:");
        Long i2 = System.nanoTime();
        List<Integer> ArrayList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            ArrayList.add(i);//-
        }
        Long f2 = System.nanoTime();
        System.out.println(f2 - i2);
        //////////////////////////////////////////////
        System.out.println("GET:");
        System.out.println("LinkedList:");
        i1 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            LinkedList.get(i);//-
        }
        f1 = System.nanoTime();
        System.out.println(f1 - i1);

        System.out.println("ArrayList:");
        i2 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            ArrayList.get(i);//+
        }
        f2 = System.nanoTime();
        System.out.println(f2 - i2);
        //////////////////////////////////////////////
        System.out.println("REMOVE:");
        System.out.println("LinkedList:");
        i1 = System.nanoTime();
        for (int i = 9999; i >=0; i--) {
            LinkedList.remove(i);//+
        }
        f1 = System.nanoTime();
        System.out.println(f1 - i1);

        System.out.println("ArrayList:");
        i2 = System.nanoTime();
        for (int i = 9999; i >=0; i--) {
            ArrayList.remove(i);//-
        }
        f2 = System.nanoTime();
        System.out.println(f2 - i2);

    }
}