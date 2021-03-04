package osti.katriel.tema2;

import java.util.ArrayList;
import java.util.List;

public class App {

    List<Object> canasta = new ArrayList<>();

    public void verificar(Object o) {
        if (o instanceof Fruta) {
            canasta.add(o);
            System.out.println("Fruta agregada: " + ((Fruta) o).getNombre());
        } else {
            System.out.println("No es una fruta: " + o.toString());
        }
    }

    public static void main(String[] args) {

        System.out.println("Ingresar solo frutas");

        Manzana m1 = new Manzana("Manzana Roja");
        Manzana m2 = new Manzana("Manzana Verde");
        Naranja n = new Naranja("Naranaja sin pepa");
        Galleta g = new Galleta("Galleta de chocolate");

        App app = new App();

        app.verificar(m1);
        app.verificar(m2);
        app.verificar(n);
        app.verificar(g);

    }
}
