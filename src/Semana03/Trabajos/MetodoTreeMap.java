/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana03.Trabajos;

import java.util.Iterator;
import java.util.Map;
import java.util.*;

/**
 *
 * @author Ario1
 */
public class MetodoTreeMap {
    
    public static void mostrarMapa(Map agenda) {
        System.out.println( agenda.size()+" Animales  " 
                );
        for (Iterator it = agenda.keySet().iterator(); it.hasNext();) {
            String clave = (String) it.next();
            String valor = (String) agenda.get(clave);
            System.out.println(clave + " : " + valor);
        }
    }

    public static void main(String args[]) {
// Definir un TreeMap 

        TreeMap Animales = new TreeMap();

// Agregar pares "clave"-"valor" al HashMap 
        Animales.put("Perro", "123");
        Animales.put("Gato", "123");
        Animales.put("Elefante", "123");
        Animales.put("Sapo", "123");
        Animales.put("Aveja", "123");
        Animales.put("Leon", "123");
        Animales.put("Tigre", "123");
        Animales.put("Oso", "123");
        Animales.put("Zorro", "123");

// Notese que el orden del TreeMap refleja un orden ascendente 
// en sus elementos independientemente del orden de insercion. 
// Debido al uso de String se refleja un orden alfabetico 
        mostrarMapa(Animales);

// Definir dos TreeMap nuevos 
        SortedMap AnilamlesAP = Animales.subMap("A", "P");
        SortedMap AnimalesPZ = Animales.subMap("P","Z");

        System.out.println("---- Animales A-O ----");
        mostrarMapa(AnilamlesAP);

        System.out.println("---- Animales P-Z ----");
        mostrarMapa(AnimalesPZ);
    }

    
}
