/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana06.teoria;

/**
 *
 * @author Ario1
 */
class animal{
    void correr(){}
}
class tortuga extends animal{
    @Override
    void correr(){
        throw new RuntimeException("La tortuga no puede correr ");
    }
}

public class Ejercicio01 {
    
}
