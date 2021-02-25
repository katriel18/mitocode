package CursoSE.src.cursose;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Banco banco=new Banco();

        Scanner s = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("BANCO XYZ");
        System.out.println("Ingrese numero de cuenta:");
        int cuenta = s.nextInt();

        String operacion = "";
        switch (cuenta) {
            case 1:
                System.out.println("-------------------------");
                System.out.println("Bienvenido " + banco.getPer1().getNombre());
                System.out.println("Ingrese operacion a realizar:");
                System.out.println("A.Depositar");
                System.out.println("B.Retirar");
                operacion = s.next();

                switch (operacion) {
                    case "A":
                        System.out.println("------------------");
                        System.out.println("Ingrese el monto a depositar");
                        double montoDeposito = s.nextDouble();
                     banco.getPer1().setMonto (banco.getPer1().getMonto() + montoDeposito);
                        System.out.println("monto final: " + banco.getPer1().getMonto());
                        break;
                    case "B":
                        System.out.println("------------------");
                        System.out.println("Ingrese el monto a retirar");
                        double montoRetiro = s.nextDouble();
                     banco.getPer1().setMonto( banco.getPer1().getMonto() - montoRetiro);
                        System.out.println("monto final: " + banco.getPer1().getMonto());

                        break;
                }
                break;
            case 2:
                System.out.println("-------------------------");
                System.out.println("Bienvenido " + banco.getPer2().getNombre());
                System.out.println("Ingrese operacion a realizar:");
                System.out.println("A.Depositar");
                System.out.println("B.Retirar");
                operacion = s.next();

                switch (operacion) {
                    case "A":
                        System.out.println("------------------");
                        System.out.println("Ingrese el monto a depositar");
                        double montoDeposito = s.nextDouble();
                        banco.getPer2().setMonto(banco.getPer2().getMonto() + montoDeposito);
                        System.out.println("monto final: " + banco.getPer2().getMonto());
                        break;
                    case "B":
                        System.out.println("------------------");
                        System.out.println("Ingrese el monto a retirar");
                        double montoRetiro = s.nextDouble();
                        banco.getPer2().setMonto(banco.getPer2().getMonto() - montoRetiro);
                        System.out.println("monto final: " + banco.getPer2().getMonto());

                        break;
                }

                break;

            case 3:
                System.out.println("-------------------------");
                System.out.println("Bienvenido " + banco.getPer3().getNombre());
                System.out.println("Ingrese operacion a realizar:");
                System.out.println("A.Depositar");
                System.out.println("B.Retirar");
                operacion = s.next();

                switch (operacion) {
                    case "A":
                        System.out.println("------------------");
                        System.out.println("Ingrese el monto a depositar");
                        double montoDeposito = s.nextDouble();
                        banco.getPer3().setMonto(banco.getPer3().getMonto() + montoDeposito);
                        System.out.println("monto final: " + banco.getPer3().getMonto());
                        break;
                    case "B":
                        System.out.println("------------------");
                        System.out.println("Ingrese el monto a retirar");
                        double montoRetiro = s.nextDouble();
                        banco.getPer3().setMonto(banco.getPer3().getMonto() - montoRetiro);
                        System.out.println("monto final: " + banco.getPer3().getMonto());

                        break;
                }

                break;

            default:
                System.out.println("cuenta no registrada");
                System.exit(0);
                break;
        }
        System.out.println( banco.getPer1().getMonto()+banco.getPer2().getMonto()+banco.getPer3().getMonto());
    }
}