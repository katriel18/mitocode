package CursoSE.src.cursose;
public class App {

    private void proceso1(){
        int a=7,b=0;
        int division=a/b;
        System.out.println(division);
    }

    public static void main(String[] args) {

        App a=null;

        try{

            //proceso 1
            a.proceso1();

        }catch(NullPointerException ex){ //excepcion mas especifica

            //manejo de la excepcion
            System.out.println("Excepcion especifica: "+ex.getMessage());

        }catch(Exception ex){   //excepcion mas general

            //Captura mas excepciones
            System.out.println("Excepcion general no especifica!");

        }finally{   //opcional

            //se ejecuta si o si
            System.out.println("Bloque finally ejecutada!");

        }

    }
}