package CursoSE.src.nuevo;

import CursoSE.src.cursose.Celular;

public class App2 {
    public static void main(String[] args) {

        Celular c=new Celular();

        //no se accede a atributos private, protected ni package
        c.nombre="solo se puede acceder al nombre (public)";
        
        System.out.println(c.nombre);
    }
}
