//javac Hola.java
//java Hola  4 2 3 4
/*
4
2
3
4
Total: 4
*/
public class Hola {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println("Total: " + args.length);
    }
}
