package CursoSE.src.cursose;

public class App {

    private void proceso1() {

        try {

            proceso2();

        } catch (Exception e) {

            System.out.println("Capturado en el proceso 1: " + e.getMessage());

        }

    }

    private void proceso2() throws Exception {

        try {

            proceso3();

        } catch (Exception e) {

            // System.out.println("Capturado en el proceso 2: "+e.getMessage());

            throw new Exception("Exepcion enviada desde el  proceso 2");//Lanzar un mensaje de la excepcion(Exception).
            //throw new Exception(e.getMessage());//Lanzar el mensaje de la excepcion(ArithmeticException) capturada.

        }

    }

    private void proceso3() {

        try {

            int division = 1 / 0;

        } catch (Exception e) {

            // System.out.println("Capturado en el proceso 3: "+e.getMessage());

            throw e; // lanzando la excepcion

        }

    }

    public void lanzadorDeExcepcionAritmetica() {//no obliga a capturarla(excepcion de ejecucion)
        throw new ArithmeticException("Division entre 0");
    }

    public void lanzadorDeExcepcion() throws Exception {//obliga a capturrarla(excepcion de compilacion)
        throw new Exception("Excepcion general");
    }

    public static void main(String[] args) {

        App a = new App();

        a.proceso1();


        System.out.println("Pruebas de lanzadores:");

        a.lanzadorDeExcepcionAritmetica();//capturarla en un  try catch para que ejecute sin excepciones

        a.lanzadorDeExcepcion();//capturarla en un  try catch para que compile el codigo

        

    }
}