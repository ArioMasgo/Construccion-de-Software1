/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana06.practica;

/**
 *
 * @author Ario1
 */
class padrino{
    void a(){}
    void b(){
        throw new  RuntimeException("Metodo avcio!!");
    }
    void c(){
        throw  new RuntimeException("fuera de rango !!");
    }
}

public class Ejericicio04 {
    public static void main(String[] args) {
        padrino p = new padrino();
        
    }
    
}
