/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana01.Trabajos;

import java.util.Scanner;

/**
 *
 * @author Ario1
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        String opcion = "";
        int galones = 0;
        do {
            System.out.println("Tipo    Precio\n"
                    + "A       50\n"
                    + "B       55\n"
                    + "C       60\n"
                    + "D        0,0 \n ");

            System.out.println("Ingrese Tipo de gasolina");
            opcion = sc.next();
            double precio = 0.0;
            switch (opcion) {
                case "A":

                    System.out.println("Ingrese cantidad de galones");
                    galones = sc.nextInt();
                    precio = 50 * galones*3.785;
                    total += precio;
                    break;
                case "B":

                    System.out.println("Ingrese cantidad de galones");
                    galones = sc.nextInt();
                    precio = 55 * galones*3.785;
                    total += precio;
                    break;
                case "C":

                    System.out.println("Ingrese cantidad de galones");
                    galones = sc.nextInt();
                    precio = 60 * galones*3.785;
                    total += precio;
                    break;

            }

        } while (!opcion.equalsIgnoreCase("D"));
        System.out.println("Total de caja " + total);

    }

}
