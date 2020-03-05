/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana04.Trabajos;

/**
 *
 * @author Ario1
 */
public class Calculadora {
    

    double multiplicacion(double a, double b) {
        return a * b;
    }

    double division(double a, double b) {
        return a / b;
    }

    double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    double RAIZCuadrada(double a) {
        return Math.sqrt(a);
    }

    int NumLetras(String p){
        return p.length();
    }

    int IngresoHoraMevotaMinutos(int a) {
        return a * 60;
    }

    double DeGrFahrenheitACelsios(double f) {
        return ((f - 32) * 5) / 9;
    }

    int mayorDeDosNumeros(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    int MayorDeTresNumeros(int a, int b, int c) {
        if (a > b && b > c) {
            return a;
        } else {
            if (b > a && b > c) {
                return b;
            } else {
                return c;
            }
        }
    }
    
    char LetraEnUnaPosicion(String p,int index){
        return p.charAt(index);
    }
    

}