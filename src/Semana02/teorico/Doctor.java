/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana02.teorico;

/**
 *
 * @author Ario1
 */
public class Doctor {
    static int idaux=1;
    private String nombre;
    private int id;

    public Doctor(String nombre) {
        this.nombre = nombre;
        id=idaux++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "\nnombre= " + nombre + "\n id= " + id ;
    }
    
}
