/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana03.teorico;

import java.util.ArrayList;

/**
 *
 * @author Ario1
 */
class Persona{
    int a,b;
    public Persona(int x,int y){
        a=x;
        b=y;
    }
    public Persona(){}
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
}
public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Persona> per =new ArrayList<Persona>();
        Persona p1=new Persona();
        p1.setA(9);
        p1.setB(7);
        per.add(p1);
        per.add(new Persona(5, 7));
    }
}

