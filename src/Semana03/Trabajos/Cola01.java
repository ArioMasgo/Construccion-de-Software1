/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana03.Trabajos;

import java.util.ArrayList;

/**
 *
 * @author Ario1
 */
public class Cola01 extends ArrayList<Object>{
    //se añade un elemento a la cola. Se añade al final de esta.
    public void encolar(Object dato) {
        if (dato != null) {
            this.add(dato);
        } else {
            System.out.println("Introduzca un dato no nulo");
        }
    }

    //se elimina el elemento frontal de la cola, es decir, el primer elemento que entró.
    public void desencolar() {
        if (this.size() > 0) {
            this.remove(0);
        }
    }

    //se devuelve el elemento frontal de la cola, es decir, el primer elemento que entró.
    public Object frente() {
        Object datoAuxiliar = null;
        if (this.size() > 0) {
            datoAuxiliar = this.get(0);
        }
        return datoAuxiliar;
    }

    //devuelve cierto si la pila está vacía o falso en caso contrario (empty).
    public boolean vacia() {
        return this.isEmpty();
    }
    
    public static void main(String[] args) {
        System.out.println("------Cola------");
        Cola01 cola = new Cola01();
        cola.encolar("A");
        cola.encolar("B");
        cola.encolar("C");
        cola.encolar("D");

        System.out.println("Esta vacia la cola?:" + cola.vacia());
        System.out.println("Tamaño de la cola:" + cola.size());

        System.out.println(cola.frente());
        cola.desencolar();
        System.out.println(cola.frente());
        cola.desencolar();
        System.out.println(cola.frente());
        cola.desencolar();
        System.out.println(cola.frente());
        cola.desencolar();

        System.out.println("Esta vacia la cola?:" + cola.vacia());
    }
}
