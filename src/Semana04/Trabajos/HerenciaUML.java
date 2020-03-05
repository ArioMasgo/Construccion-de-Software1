/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana04.Trabajos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ario1
 */
abstract class Poligono {

    private int numLados;

    public Poligono(int numLados) {
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public abstract double area();
}

class Triangulo extends Poligono {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double area() {
        double p = (lado1 + lado2 + lado3) / 2;
        return p;
    }

}

class Rombo extends Poligono {

    private double diagonal1;
    private double diagonal2;

    public Rombo(double dia1, double dia2) {
        super(2);
        this.diagonal1 = dia1;
        this.diagonal2 = dia2;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    @Override
    public double area() {
        return (diagonal1 * diagonal2) / 2;
    }

}

public class HerenciaUML {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l1,l2,l3,dia1,dia2;
        int op=0;
        do {    
            System.out.println("\t----Menu de opciones------");
            System.out.println("1: Area del Triangulo");
            System.out.println("2: Area de un rombo");
            System.out.println("3: Salir");
            System.out.println("Eliga una de la opciones (1-5)");
            op=sc.nextInt();
            switch(op){
                case 1:
                    l1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado 1:"));
                    l2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado 2:"));
                    l3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado 3:"));
                    Triangulo t = new Triangulo(l1,l2,l3);
                    System.out.printf("Área del triángulo: " + t.area());            
                    System.out.println("\n");
                    
                    break;
                
                case 2:
                    dia1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la primera diagonal"));
                    dia2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la segunda diagonal"));
                    Rombo s = new Rombo(dia1, dia2);
                    System.out.println("El Area del rombo es :"+s.area());
                    System.out.println("\n");
                    break;
               
            
            }
                  
            
        } while (op!=3);
      
       
        
    }
}
