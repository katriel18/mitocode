package osti.katriel.DateAPI;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * App
 */
public class App {

    public void fechas(int jdk){
        if(jdk<=7){
            Calendar fecha1=Calendar.getInstance();
            Calendar fecha2=Calendar.getInstance();

            System.out.println(fecha1);
            System.out.println("--------------");
            System.out.println(fecha2);
            System.out.println("--------------");
            
            fecha1.set(1999,12,21);
            System.out.println(fecha1);
            System.out.println("--------------");
            System.out.println(fecha1.after(fecha2));

            

        }else{

            LocalDate fecha1=LocalDate.of(1999,12,21);
            LocalDate fecha2=LocalDate.now();
            System.out.println(fecha1);
            System.out.println("--------------");
            System.out.println(fecha2);
            System.out.println("--------------");

            LocalTime tiempo1=LocalTime.of(5, 30, 15);
            LocalTime tiempo2=LocalTime.now();
            System.out.println(tiempo1);
            System.out.println("--------------");
            System.out.println(tiempo2);
            System.out.println("--------------");

            LocalDateTime fechaTiempo1=LocalDateTime.of(1999,12,21,5, 30, 15);
            LocalDateTime fechaTiempo2=LocalDateTime.now();
            System.out.println(fechaTiempo1);
            System.out.println("--------------");
            System.out.println(fechaTiempo2);
            System.out.println("--------------");

        }

    } 

    public void medirTiempo(int jdk) throws InterruptedException{
        if(jdk<8){
            long ini=System.currentTimeMillis();
            Thread.sleep(1000);
            long fin=System.currentTimeMillis();
            System.out.println(fin-ini);
        }else{
            Instant ini=Instant.now();
            Thread.sleep(1000);
            Instant fin=Instant.now();
            System.out.println(Duration.between(ini, fin).toMillis());
        }
    }

    public void periodoEntreFecha(int jdk){
        if(jdk<8){
            Calendar nacimiento=Calendar.getInstance();
            Calendar actual=Calendar.getInstance();

            nacimiento.set(1995,5,13);//months [0-11]
            actual.set(2021, 3,24);

            int anios=0;

            while(nacimiento.before(actual)){
                nacimiento.add(Calendar.YEAR, 1);
                if (nacimiento.before(actual)) {
                    anios++;
                }
            }
            System.out.println(anios);

        }else{
            LocalDate nac=LocalDate.of(1995, 6, 13);
            LocalDate act=LocalDate.now();
            Period periodo=Period.between(nac, act);

            System.out.println(periodo.getYears());
            System.out.println(periodo.getMonths());
            System.out.println(periodo.getDays());
        }
    }

    public void convertir(int jdk) throws ParseException{

        if(jdk<8){
            String fecha="13/06/1995";
            DateFormat formateador=new SimpleDateFormat("dd/MM/yyyy");
            Date fechaConvertida=formateador.parse(fecha);
            System.out.println(fechaConvertida);

            Date fechaActual=Calendar.getInstance().getTime();
            formateador=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
            String fechaCadena=formateador.format(fechaActual);
            System.out.println(fechaCadena);
        }else{

            String fecha="21/01/1991";
            DateTimeFormatter formateador=DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaLocal=LocalDate.parse(fecha,formateador);
            System.out.println(fechaLocal);
            System.out.println(formateador.format(fechaLocal));

            formateador=DateTimeFormatter.ofPattern("ddMMyyyy");
            System.out.println(formateador.format(fechaLocal));
            
        }
    }

    public static void main(String[] args) throws InterruptedException, ParseException {
        App a=new App();
        //a.fechas(8);
        //a.medirTiempo(8);
        //a.periodoEntreFecha(8);
        a.convertir(8);
    }
    
}