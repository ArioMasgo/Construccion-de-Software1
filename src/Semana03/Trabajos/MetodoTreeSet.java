/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana03.Trabajos;

/**
 *
 * @author Ario1
 */

import java.util.*;

class Alumno implements Comparable {

    public String nombre;
    public int codigo;

    public Alumno(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Cantidad: " + codigo;
    }
    
// Indica en base a que atributos se compara el objeto
// Devuelve +1 si this es > que objeto
// Devuelve -1 si this es < que objeto
// Devuelve 0 si son iguales

    @Override
    public int compareTo(Object objeto) {
        Alumno alum = (Alumno) objeto;
        String nombreObjeto = alum.nombre.toLowerCase();
        String nombreThis = this.nombre.toLowerCase();

        return nombreThis.compareTo(nombreObjeto);
    }
}


public class MetodoTreeSet {
    
     public static void mostrarLista(Collection lista) {
        System.out.println(" Lista del mercado con " + lista.size()
                + " productos");
         for (Object object : lista) {
             System.out.println(object.toString());
         }
    }

    public static void main(String args[]) {

        Alumno A1 = new Alumno("Pedro", 6);
        Alumno A2 = new Alumno("Mario", 2);
        Alumno A3 = new Alumno("Juan", 5);
        Alumno A4 = new Alumno("Luis", 2);
        Alumno A5 = new Alumno("Fernando", 2);
        Alumno A6 = new Alumno("Pedro", 3);

        HashSet lista = new HashSet();
        lista.add(A1);
        lista.add(A2);
        lista.add(A3);
        lista.add(A4);
        lista.add(A5);
        lista.add(A6);

        mostrarLista(lista);

 
//        lista.remove(A3);
//        mostrarLista(lista);

        lista.clear();
//        mostrarLista(lista);
        
    }
    
}

