/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana02.Trabajos.EventosMasgo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ario1
 */
public class FechaYHora {
    private int dia;
    private int mes;
    private int anio;
    private int hh;
    private int mm;
    SimpleDateFormat dateFormat = new SimpleDateFormat("H:m:s");
    Date fecha1;
    Date fecha2;
    public FechaYHora() {
        Calendar calendario = Calendar.getInstance();
        this.dia = calendario.get(Calendar.DATE);
        this.mes = calendario.get(Calendar.MONTH);
        this.anio = calendario.get(Calendar.YEAR);
//        fecha1 = dateFormat.parse(fechainicio);
//        fecha2 = dateFormat.parse(fechafin);

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }
    
    public void diferenciaFecha(){
        
        int diferencia=(int) ((fecha1.getTime()-fecha2.getTime())/1000);
////        if(diferencia>86400) {
////            dia=(int)Math.floor(diferencia/86400);
////            diferencia=diferencia-(dia*86400);
////        }
        if(diferencia>3600) {
            hh=(int)Math.floor(diferencia/3600);
            diferencia=diferencia-(hh*3600);
        }
        if(diferencia>60) {
            mm=(int)Math.floor(diferencia/60);
            diferencia=diferencia-(mm*60);
        }
        System.out.println("Hay "+hh+" horas, "+mm+" minutos y "+diferencia+" segundos de diferencia");
    }
    
    public String MostrarFecha(){
        return getDia()+"/"+getMes()+"/"+getAnio()+" "+getHh()+" : "+getMm();
    }
//    public static void main(String[] args) throws ParseException {
//        FechaYHora sc = new FechaYHora("09:00:00", "10:00:00");
//        sc.diferenciaFecha();
//        sc.MostrarFecha();
//    }
}
 

