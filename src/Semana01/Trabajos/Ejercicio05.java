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
public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese numero de alumnos: ");
        int numAlumno = sc.nextInt();
        int promedio=0,suma=0,con=0;
        do {
            System.out.println("Ingrese notas ");
            int nota=sc.nextInt();
            suma+=nota;
            numAlumno--;
            con++;
        } while (numAlumno!=0);
        promedio=suma/con;
        
        System.out.println("El promedio es :"+promedio);

    }
}
