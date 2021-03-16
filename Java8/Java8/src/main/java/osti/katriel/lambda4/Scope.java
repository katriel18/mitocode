package osti.katriel.lambda4;

public class Scope {

    public void probarScope() {
        
       double n3=10;// Es final por defecto //Ya no se puede modificar

       //jdk<1.7
        Operacion operacion=new Operacion(){

            @Override
            public double calcular(double n1, double n2) {
                return n1+n2+n3;
            }
            
        };
        System.out.println(operacion.calcular(5, 5));
        
        //JDK>1.8
        Operacion operacion2=(double n1, double n2)->{
            return n1+n2+n3;
        };

        System.out.println(operacion2.calcular(5, 5));

    }

    public static void main(String args[]) {
       
        Scope s=new Scope();
        s.probarScope();
        
    }
}
