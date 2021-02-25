package CursoSE.src.cursose;
public class App {

    private void proceso1(){
        int a=7,b=0;
        int division=a/b;
        System.out.println(division);
    }

    public static void main(String[] args) {

        App a=new App();

        try{

            //proceso 1
            a.proceso1();

        }catch(Exception ex){

            //manejo de la excepcion
            System.out.println("Excepcion: "+ex.getMessage());

        }finally{   //opcional

            //se ejecuta si o si
            System.out.println("Bloque finally ejecutada!");
            
        }

    }
}