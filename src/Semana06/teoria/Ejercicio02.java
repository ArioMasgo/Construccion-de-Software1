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
interface Irectangulo{
    int CalcularArea();
}

class rectangulo implements Irectangulo{
    int x,y;
    public rectangulo(int a,int b){
        this.x=a;
        this.y=b;
    }
    public int CalcularArea(){
        return x*y;
    }
}

class square implements Irectangulo{
    
    int x;
    public square(int a) {
        x=a;
    }

    @Override
    public int CalcularArea() {
        return x*x;
    }

}
public class Ejercicio02 {
    public static void main(String[] args) {
        Irectangulo s= new rectangulo(4, 5);
        Irectangulo c = new square(6);
        System.out.println(c.CalcularArea());
        System.out.println(s.CalcularArea());
    }
}
