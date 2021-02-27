package CursoSE.src.cursose.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import CursoSE.src.cursose.Persona;
import CursoSE.src.cursose.interfaces.DAOPersona;

public class DAOPersonaImpl extends Conexion implements DAOPersona {

    @Override
    public void registrar(Persona p) throws Exception {
       
        try {
            this.conectar();
            PreparedStatement ps=this.conexion.prepareStatement("INSERT INTO persona(nombre) VALUES(?)");
            ps.setString(1, p.getNombre());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally{
            this.cerrar();
        }

    }

    @Override
    public void modificar(Persona p) throws Exception {
        
        try {
            this.conectar();
            PreparedStatement ps=this.conexion.prepareStatement("UPDATE persona SET nombre=? WHERE id=?");
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally{
            this.cerrar();
        }

    }

    @Override
    public void eliminar(Persona p)  throws Exception{
        
        try {
            this.conectar();
            PreparedStatement ps=this.conexion.prepareStatement("DELETE FROM persona WHERE id=?");
            ps.setInt(1, p.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally{
            this.cerrar();
        }

    }

    @Override
    public List<Persona> listar() throws Exception {
        List<Persona> lista;
        try {
            this.conectar();
            PreparedStatement ps=this.conexion.prepareStatement("SELECT * FROM persona");
            ResultSet rs= ps.executeQuery();
            lista=new ArrayList<>();
            while (rs.next()) {
                lista.add(new Persona(rs.getInt("id"), rs.getString("nombre")));
            }

            rs.close();
            ps.close();
        } catch (Exception e) {
            throw e;
        }finally{
            this.cerrar();
        }
        return lista;
    }


    
}
