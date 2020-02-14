/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestorVentaLaLechera;

import java.util.Calendar;

/**
 *
 * @author Ario1
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        Calendar calendario = Calendar.getInstance();
        this.dia = calendario.get(Calendar.DATE);
        this.mes = calendario.get(Calendar.MONTH);
        this.anio = calendario.get(Calendar.YEAR);
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
    
    public String MostrarFecha(){
        return getDia()+"/"+getMes()+"/"+getAnio();
    }
}
