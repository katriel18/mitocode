package CursoSE.src.cursose;

public class App {
    public static void main(String[] args) throws Exception {

        Number x = new Integer("9");
        System.out.println(x);
        Number y = new Integer(9);
        System.out.println(y);

        int x1=18;
        System.out.println(x1);
        Integer y2=18;
        System.out.println(y2);

        //int x3=null; //no valido
        Integer y3=null; //valido - Base de datos

        String texto="99";
        int suma=Integer.parseInt(texto)+1;
        System.out.println(suma);
    }
}
