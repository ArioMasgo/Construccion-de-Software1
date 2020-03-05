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
interface ejemplo {

    static final double PI = 3.14;

    void comer();

    void caminar();
}
interface a{
    void correr();
}
interface b{
    void correr();
}
interface c{
    void correr();
}
class example implements a,b,c{

    public void correr() {
        
    }

}
public abstract class Ejercicio02 {

    static final double PI = 3.14;

    abstract void comer();
    

    abstract void caminar() ;
    
}
