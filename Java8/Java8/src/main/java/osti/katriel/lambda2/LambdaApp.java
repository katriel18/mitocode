package osti.katriel.lambda2;

public class LambdaApp {


    public void calcular(){
     
        //JDK<1.7
        Operacion operacion=new Operacion(){

            @Override
            public double calcularPromedio(double n1, double n2) {
                return (n1+n2)/2;
            }
            
        };
        System.out.println(operacion.calcularPromedio(8, 10));
        
        //JDK>1.8
        Operacion operacion2=(double n1, double n2)->(n1+n2)/2;
        System.out.println(operacion2.calcularPromedio(8, 10));
        
    }

    public static void main(String args[]) {
       
        LambdaApp la=new LambdaApp();
        la.calcular();

    }
}
