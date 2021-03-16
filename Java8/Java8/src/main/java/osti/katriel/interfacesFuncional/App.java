package osti.katriel.interfacesFuncional;

public class App {

    public void calcular(){
        
        //JDK>1.8
        Operacion operacion2=(double n1, double n2)->(n1+n2)/2;
        System.out.println(operacion2.operar(8, 10));
        
    }

    public static void main(String args[]) {
       
        App a=new App();
        a.calcular();

    }
    
}
