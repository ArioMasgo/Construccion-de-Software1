/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana08.Practica.Codigo;

import Semana08.Trabajos.Paleta.*;

/**
 *
 * @author Ario1
 */
public class Fecha {
     private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
//        Calendar calendario = Calendar.getInstance();
//        calendario.get(Calendar.DATE);
//        calendario.get(Calendar.MONTH);
//        calendario.get(Calendar.YEAR);
        this.dia=dia;
        this.mes=mes;
        this.anio =anio;
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

    public String MostrarFecha() {
        return getDia() + "/" + getMes() + "/" + getAnio();
    }
}
