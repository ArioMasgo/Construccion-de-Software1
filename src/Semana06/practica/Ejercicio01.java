/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana06.practica;

import java.util.ArrayList;

/**
 *
 * @author Ario1
 */
interface impresora{
    void imprimir(Object o);
}
class Persona{
    String name;
    double sueldo;

    public Persona(String name, double sueldo) {
        this.name = name;
        this.sueldo = sueldo;
    }
    
    
}
class Padron{
    ArrayList<Persona> p=new ArrayList<>();
    Padron(Persona per){
    p.add(per);
    
    }
    
}
class Tinta implements impresora{
    @Override
    public void imprimir(Object o) {
        
    }
}
class Laser implements impresora{
    @Override
    public void imprimir(Object o) {
         
    }
}    
class termica implements impresora{
    @Override
    public void imprimir(Object o) {
        if (o instanceof Persona) {
            System.out.println("EL ");
        }
    }
    

}
class ServicioImpresion{
    impresora impri;
    
   
    void ServicioImprimir(impresora p){
        impri=p;
    }
    public void mostrar(Padron p){
    impri.imprimir(p);
    }

}

public class Ejercicio01 {
    public static void main(String[] args) {
        ServicioImpresion s = new ServicioImpresion();
        s.ServicioImprimir(new termica());
        s.mostrar(new Padron(new Persona("luis", 123)));
    }
    
}
