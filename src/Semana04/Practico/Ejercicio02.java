/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana04.Practico;


abstract class  humano {
    protected String nombre;
    protected String apellido;

    public humano(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String nombreCompleto(){
        return this.nombre+ " "+this.apellido;
    }
    public String identificacion(){
        return this.nombreCompleto();
    }
    
}
class ciudadano extends humano{
    private String documento;

    public ciudadano(String nombre,String apellido,String documento) {
        super(nombre, apellido);
        this.documento =documento;
    }
    public String MostrarCiudadan0(){
        return super.identificacion()+"  documento: "+documento;
    }

    
    
}
public class Ejercicio02{
    public static void main(String[] args) {
        ciudadano s = new ciudadano("luis", "Peres", "23456");
        System.out.println(s.MostrarCiudadan0());
    }
    
}
