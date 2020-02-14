/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana03.Trabajos.Propuesto;

/**
 *
 * @author Ario1
 */
public class Socio {
    private String nombre;
    private int anio;

    public Socio(String nombre, int anio) {
        this.nombre = nombre;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    @Override
    public String toString() {
        return  "\nnombre:" + nombre + "\nanio: " + anio ;
    }
    
    
}
