/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana03.practica;

import java.util.ArrayList;

/**
 *
 * @author Ario1
 */
public class Alumno {
    private String nombre;
    private int edad;
    public Alumno(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

//    @Override
//    public String toString() {
//        return  "\nnombre:" + nombre + "\n edad=" + edad +"" ;
//    }
    void edad(int edad){
        if (edad<18) {
            System.out.println("menor de edad");
        }else{
            System.out.println("mayor de edad");
        }
    }
    
}
class metodo{
    ArrayList<Alumno> alum = new ArrayList<Alumno>();
    
    void crearAlum(Alumno e){
        alum.add(e);
    }

    void imprimir(){
        for (int i = 0; i < alum.size(); i++) {
            if (alum.get(i).getEdad()<=18) {
                System.out.println("\nnombre: "+alum.get(i).getNombre()+"\nedad: "+alum.get(i).getEdad());
                System.out.println("Es menor de edad"); 
           }else {
                System.out.println("\nnombre: "+alum.get(i).getNombre()+"\nedad: "+alum.get(i).getEdad());
                System.out.println("es mayor de edad");
            }
        }
    }
    public static void main(String[] args) {
        metodo m= new metodo();
        m.crearAlum(new Alumno("luis", 15));
        m.crearAlum(new Alumno("pedro", 25));
        m.crearAlum(new Alumno("Mario", 66));
        m.imprimir();
        
    }
}
