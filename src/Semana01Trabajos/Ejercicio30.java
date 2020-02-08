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
public class Ejercicio30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero de Gallinas: ");
        int ngallinas = sc.nextInt();
        double peso = 0, altura = 0, calidad = 0, c1 = 0, c2 = 0, c3 = 0, suma = 0, promedio = 0;
        int i = 0, nhuevos;
        do {
            System.out.println("Peso de la gallina: " + i + "=");
            peso = sc.nextDouble();
            System.out.println("Altura de la gallina: " + i + "=");
            altura = sc.nextDouble();
            System.out.println("Numero de huevos que pone la gallina :" + i + "=");
            nhuevos = sc.nextInt();
            calidad = peso * altura / (double) nhuevos;
            suma = +calidad;
            ngallinas--;
            i++;
        } while (ngallinas != 0);
        promedio = suma / i;
        if (suma >= 15) {
            c1 = 1.2 * promedio;
            System.out.println("El Precio por kilo de huevo es: "+c1);
        }
        if (suma > 8 && suma < 15) {
            c2 = 1.00 * promedio;
            System.out.println("El Precio por kilo de huevo es: "+c2);
        }
        if (suma <= 8) {
            c3 = 0.80 * promedio;
            System.out.println("El Precio por kilo de huevo es: "+c3);
        }
        
    }

}
