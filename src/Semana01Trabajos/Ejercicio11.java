/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana01Trabajos;

import java.util.Scanner;

/**
 *
 * @author Ario1
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, n = 4, cont = 2;
        String cad = "";
        System.out.println("ingrese un numero");
        num = sc.nextInt();
        if (num > 2) {
            cad = "2 - 3";
            while (cont < num) {
                i = 2;
                while (i <= n) { 
                    if (i == n) {
                        cad = cad + " - " + n;
                        cont ++;
                    } else {
                        if (n % i == 0) {
                            i = n;
                        }
                    }
                    i++;
                }
                n++ ;
            }
            System.out.println(cad);
        }

    }

}
