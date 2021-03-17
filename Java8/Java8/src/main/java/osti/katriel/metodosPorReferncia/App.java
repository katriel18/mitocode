package osti.katriel.metodosPorReferncia;

public class App {

    public static void referenciarMetodoStatic(){
        System.out.println("Metodo referido Static");
    }

    public void operar(){
        
        Operacion operacion=()->App.referenciarMetodoStatic();
        operacion.saludar();

        Operacion operacion2=App::referenciarMetodoStatic;
        operacion2.saludar();

    }

    public static void main(String args[]) {
       
        App a=new App();
        a.operar();

    }
    
}
