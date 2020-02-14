/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana03.teorico;

/**
 *
 * @author Ario1
 */
interface padre{
    //variables constantes
    int CAD=14;
    //metodos abstractos
    void dormir();
    void comer(int p);
    void comer(int p,float y);
}
abstract class canino{
    abstract void comer();
    abstract void dormir();
    abstract void caminar();
}//se crea clases abstractas para comportarse como super clases
class perro extends canino{

  
    void comer() {
        
    }

 
    void dormir() {
        
    }

    
    void caminar() {
        
    }
    
}

public class ejemplo1 {
    
}
