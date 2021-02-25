package CursoSE.src.cursose;

public class Celular {

    private String nombre;
    private String color;
    private String serie;

    public String getNombre() {
        if (nombre == null) {
            nombre = "SIN NOMBRE";
        }
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        if (color == null) {
            color = "SIN COLOR";
        }
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerie() {
        if (serie == null) {
            serie = "SIN SERIE";
        }
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String mostrar() {
        return "Celular [nombre=" +getNombre()+ ", color=" + getColor()+ ", serie=" + getSerie() + "]";
    }

}
