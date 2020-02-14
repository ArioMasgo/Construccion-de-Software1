/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana03.Trabajos.Banco;

/**
 *
 * @author Ario1
 */
public class Cliente {
    private String nombre;
    private int monto;

    public Cliente(String nombre) {
        this.nombre=nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return  "\nnombre: " + nombre + "\nmonto: " + monto ;
    }
    
}
