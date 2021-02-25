package CursoSE.src.cursose;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {

    public static void main(String[] args) {

        Date fecha =new Date();
        System.out.println(fecha.getYear()+1900);//año
        System.out.println(fecha.getDate());    //dia

        System.out.println("-------------");
        Calendar calendario =Calendar.getInstance();
        System.out.println(calendario.get(Calendar.YEAR));  
        System.out.println(calendario.get(Calendar.DAY_OF_MONTH)); 

        System.out.println("-------------");
        Calendar calendario2 =new GregorianCalendar();
        System.out.println(calendario2.get(Calendar.YEAR)); 
    }
}