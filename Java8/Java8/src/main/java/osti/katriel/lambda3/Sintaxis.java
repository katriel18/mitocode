package osti.katriel.lambda3;

public class Sintaxis {

    public double probarSintaxis() {
        
       //Operacion o1=(double x,double y)->(x+y)/2;
       //Operacion o1=(x,y)->(x+y)/2;
       //Operacion o1=(double x,double y)->{return (x+y)/2;};
       /*Operacion o1=(double x,double y)->{
           System.out.print("El promedio de "+x+" "+y+" es ");
           return (x+y)/2;
        };*/
      
        //return o1.calcularPromedio(6, 8);


        //Operacion o1=()->2;
        Operacion o1=()->{
            return 8+2;
         };
        return o1.sumar();

    }

    public static void main(String args[]) {
       
        Sintaxis s=new Sintaxis();
        System.out.println(s.probarSintaxis());
        
    }
}
