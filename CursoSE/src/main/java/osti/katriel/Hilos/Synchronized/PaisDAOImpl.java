package osti.katriel.Hilos.Synchronized;

import java.util.ArrayList;
import java.util.List;

/**
 * PaisDAOImpl
 */
public class PaisDAOImpl {

    private List<Pais> paises;
    private static PaisDAOImpl instancia;

    private PaisDAOImpl() {
        
    }

    //synchronized hace que los hilos usen solo una instancia
    public static synchronized PaisDAOImpl getInstance() {
        if(instancia==null){
            instancia=new PaisDAOImpl();
            System.out.println("Se ha creado una instancia!");
        }
        return instancia;
    }

    public List<Pais> getPaises(){
        if(paises==null){
            paises=new ArrayList<>();

            paises.add(new Pais("Peru"));
            paises.add(new Pais("Bolivia"));
            paises.add(new Pais("Argentina"));
        }
        return paises;
    }
}