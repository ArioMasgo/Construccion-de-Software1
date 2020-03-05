/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana03.Trabajos;

import java.util.TreeSet;

/**
 *
 * @author Ario1
 */   
    

public class Ejercicio02 {
    TreeSet<Integer> numero = new TreeSet<Integer>();
    
    public void Agreagar(){
        for (int i = 0; i < 300; i++) {
            numero.add(aleatorio(1, 100));
        }
            
    }
    
    public void mostrar(){
        for (Integer num : numero) {
            System.out.println(num.toString());
        }
    }
   
    
     static int aleatorio(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
     public static void main(String[] args) {
        Ejercicio02 s = new Ejercicio02();
        s.Agreagar();
        s.mostrar();
         
         
         
    }
    
}
