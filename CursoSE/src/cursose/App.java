package CursoSE.src.cursose;

import CursoSE.src.cursose.dao.DAOPersonaImpl;
import CursoSE.src.cursose.interfaces.DAOPersona;

public class App {

    public static void main(String[] args) {

        DAOPersona dao = new DAOPersonaImpl();
        

        //REGISTRAR
        Persona p1 = new Persona("Maicol3");
        /*
        try {
            dao.registrar(p1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */

        //MODIFICAR
        p1 = new Persona(11,"Maicol1");
        /*
        try {
            dao.modificar(p1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */

        //ELIMINAR
        p1 = new Persona(13);//11,12,13
       
        try {
            dao.eliminar(p1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //LISTAR
        try {
            for (Persona p : dao.listar()) {
                System.out.println(p.toString());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

}