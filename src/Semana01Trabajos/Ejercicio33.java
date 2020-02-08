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
public class Ejercicio33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sn = 0, ss = 0, sce = 0;
        int zona = 0;
        System.out.println("Ingrese n votantes");
        int nvotantes = sc.nextInt();
        do {
            System.out.println("Ingrese la seccion: "
                    + "1.Zona Norte ,2.Zona Sur, 3.Zona Centro");
            zona = sc.nextInt();
            if (zona == 1) {
                sn++;
            }
            if (zona == 2) {
                ss++;
            }
            if (zona == 3) {
                sce++;
            }

            nvotantes--;
        } while (nvotantes != 0);
        if (sn > ss && sn > sce) {
            System.out.println("La seccion con mayor numero de votantes es la seccion NORTE con :" + sn + " Personas");
        } else if (ss > sn && ss > sce) {
            System.out.println("La seccion con mayor numero de votantes es la seccion SUR con :" + ss + " Personas");
        } else {
            System.out.println("La seccion con mayor numero de votantes es la seccion CENTRO con :" + sce + " Personas");
        }
    }
}
