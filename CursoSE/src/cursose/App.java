package CursoSE.src.cursose;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        p1.setCuenta(1);
        p1.setNombre("Luis");
        p1.setMonto(500);
        Persona p2 = new Persona();
        p2.setCuenta(2);
        p2.setNombre("Pedro");
        p2.setMonto(1000);
        Persona p3 = new Persona();
        p3.setCuenta(3);
        p3.setNombre("Jesus");
        p3.setMonto(250);

        Scanner s = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("BANCO XYZ");
        System.out.println("Ingrese numero de cuenta:");
        int cuenta = s.nextInt();

        String operacion = "";
        switch (cuenta) {
            case 1:
                System.out.println("-------------------------");
                System.out.println("Bienvenido " + p1.getNombre());
                System.out.println("Ingrese operacion a realizar:");
                System.out.println("A.Depositar");
                System.out.println("B.Retirar");
                operacion = s.next();

                switch (operacion) {
                    case "A":
                        System.out.println("------------------");
                        System.out.println("Ingrese el monto a depositar");
                        double montoDeposito = s.nextDouble();
                        p1.setMonto(p1.getMonto() + montoDeposito);
                        System.out.println("monto final: " + p1.getMonto());
                        break;
                    case "B":
                        System.out.println("------------------");
                        System.out.println("Ingrese el monto a retirar");
                        double montoRetiro = s.nextDouble();
                        p1.setMonto(p1.getMonto() - montoRetiro);
                        System.out.println("monto final: " + p1.getMonto());

                        break;
                }
                break;
            case 2:
                System.out.println("-------------------------");
                System.out.println("Bienvenido " + p2.getNombre());
                System.out.println("Ingrese operacion a realizar:");
                System.out.println("A.Depositar");
                System.out.println("B.Retirar");
                operacion = s.next();

                switch (operacion) {
                    case "A":
                        System.out.println("------------------");
                        System.out.println("Ingrese el monto a depositar");
                        double montoDeposito = s.nextDouble();
                        p2.setMonto(p2.getMonto() + montoDeposito);
                        System.out.println("monto final: " + p2.getMonto());
                        break;
                    case "B":
                        System.out.println("------------------");
                        System.out.println("Ingrese el monto a retirar");
                        double montoRetiro = s.nextDouble();
                        p2.setMonto(p2.getMonto() - montoRetiro);
                        System.out.println("monto final: " + p2.getMonto());

                        break;
                }

                break;

            case 3:
                System.out.println("-------------------------");
                System.out.println("Bienvenido " + p3.getNombre());
                System.out.println("Ingrese operacion a realizar:");
                System.out.println("A.Depositar");
                System.out.println("B.Retirar");
                operacion = s.next();

                switch (operacion) {
                    case "A":
                        System.out.println("------------------");
                        System.out.println("Ingrese el monto a depositar");
                        double montoDeposito = s.nextDouble();
                        p3.setMonto(p3.getMonto() + montoDeposito);
                        System.out.println("monto final: " + p3.getMonto());
                        break;
                    case "B":
                        System.out.println("------------------");
                        System.out.println("Ingrese el monto a retirar");
                        double montoRetiro = s.nextDouble();
                        p3.setMonto(p3.getMonto() - montoRetiro);
                        System.out.println("monto final: " + p3.getMonto());

                        break;
                }

                break;

            default:
                System.out.println("cuenta no registrada");
                System.exit(0);
                break;
        }
        System.out.println(p1.getMonto()+p2.getMonto()+p3.getMonto());
    }
}