package CursoSE.src.cursose;

public class App {

    public static void main(String[] args) {

        ////////////////////////////Hace uso de 1000 objetos en la concatenacion
       
        long t_i=System.nanoTime();
        
        String texto="";
        for (int i = 0; i < 1000; i++) {
            texto+=i;
        }

        long t_f=System.nanoTime();
        double diferencia=t_f-t_i;
        System.out.println("String:\n"+diferencia);
       
        ///////////////////////////////Hace uso de un solo objeto en la concatenacion - eficiente 
        
        long t_i2=System.nanoTime();
        
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            builder.append(i);
        }

        long t_f2=System.nanoTime();
        double diferencia2=t_f2-t_i2;
        System.out.println("StringBuilder:\n"+diferencia2);
    }
}