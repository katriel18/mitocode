package CursoSE.src.cursose;

public class Banco {
    
    private Persona per1;
    private Persona per2;
    private Persona per3;

    public Banco() {
        per1 = new Persona();
        per1.setCuenta(1);
        per1.setNombre("Luis");
        per1.setMonto(500);
        per2 = new Persona();
        per2.setCuenta(2);
        per2.setNombre("Pedro");
        per2.setMonto(1000);
        per3 = new Persona();
        per3.setCuenta(3);
        per3.setNombre("Jesus");
        per3.setMonto(250);
    }

    public Persona getPer1() {
        return per1;
    }

    public void setPer1(Persona per1) {
        this.per1 = per1;
    }

    public Persona getPer2() {
        return per2;
    }

    public void setPer2(Persona per2) {
        this.per2 = per2;
    }

    public Persona getPer3() {
        return per3;
    }

    public void setPer3(Persona per3) {
        this.per3 = per3;
    }

}
