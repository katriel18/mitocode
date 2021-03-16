package osti.katriel.lambda4;

public class Scope {

    private static double atributo1;
    private Double atributo2;

    public void probarScopeLocal() {
        
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

    public void probarScopeStatic(){

        //jdk<1.7
        Operacion operacion=new Operacion(){

            @Override
            public double calcular(double n1, double n2) {
                atributo1=n1+n2;
                atributo2=atributo1+10;
                return atributo2;
            }
            
        };
        System.out.println(operacion.calcular(5, 5));

        //JDK>1.8
        Operacion operacion2=(double n1, double n2)->{
            atributo1=n1+n2;
            atributo2=atributo1+10;
            return atributo2;
        };

        System.out.println(operacion2.calcular(5, 5));

    }


    public static void main(String args[]) {
       
        Scope s=new Scope();
        //s.probarScopeLocal();
        s.probarScopeStatic();

    }
    
}
