/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana02.teorico;

import java.util.ArrayList;

/**
 *
 * @author Ario1
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        ArrayList<String> cadena = new ArrayList<>();
        cadena.add("A");
        cadena.add("B");
        cadena.add("C");
        cadena.add("D");
        cadena.add("E");
        cadena.add("F");
        
        for (String e : cadena) {
            System.out.println("Cadena: "+e);
        }
    }
}
