package CursoSE.src.cursose.interfaces;

import java.util.List;

import CursoSE.src.cursose.Persona;

public interface DAOPersona {
    
    public void registrar(Persona p) throws Exception;
    public void modificar(Persona p) throws Exception;
    public void eliminar(Persona p) throws Exception;
    public List<Persona> listar() throws Exception;
    

}
