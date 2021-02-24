package CursoSE.src.cursose;

public class App {
    public static void main(String[] args) throws Exception {

        // alt+62 >
        // alt+60 <
        /*
         * = == != > <´>= <=
         */

        int x = 30;

        if (x > 50) {
            System.out.println("Sentencia if");
        } else {
            System.out.println("Sentecia else");
        }

        if (x == 50) {
            System.out.println("Sentencia 50");
        } else if (x == 40) {
            System.out.println("Sentecia 40");
        } else if (x == 30) {
            System.out.println("Sentecia 30");
        } else {
            System.out.println("Sentecia null");
        }

        String mayor = (x > 200) ? "mayor" : "menor";
        System.out.println(mayor);
    }
}
