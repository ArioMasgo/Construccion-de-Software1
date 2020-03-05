/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana05.teorico;

/**
 *
 * @author Ario1
 */
abstract class padre{
    int x, y;
    String Saludar(){
        return "buenos dias";
    }
    abstract void CortePelo();
}
class hijas extends padre{
    String Saludar(){
        return "good morning";
    }

    
    void CortePelo() {
        
    }
}
public class Ejercicio01 {
    public static void main(String[] args) {
        hijas p= new hijas();
        System.out.println(p.Saludar());
    }
}
