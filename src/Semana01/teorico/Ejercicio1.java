/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana01.teorico;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ario1
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("HOLA MUNDO");
        System.out.println("---------------------------");
        Scanner sc = new Scanner(System.in);
        int suma=0;
        System.out.println("ingresar un numero");
        int num1=sc.nextInt();
        System.out.println("ingresar un numero");
        int num2=sc.nextInt();
        suma=num1+num2;
        System.out.println("L suma es: "+suma);
        
        System.out.println("----------------------------------");
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in  ));
            System.out.println("Ingrese un nombre");
            String n=bf.readLine();
            System.out.println("hola "+ n);
            
            System.out.println("------------------------------");
            int suma2;
            System.out.println("Ingrese dos numeros ");
            String numCadena = bf.readLine();      
            int n1 = Integer.parseInt(numCadena);
            String numCadena1 = bf.readLine();      
            int n2 = Integer.parseInt(numCadena1);
            suma2=n1+n2;
            System.out.println("La suma es :"+suma2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
}
