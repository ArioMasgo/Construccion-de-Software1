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
public class Ejericicio02 {
    public static void main(String[] args) {
        double x=15.2,y=0;
        try {
//            double resul=x/y;
//            System.out.println("Division"+ resul);
                String name =null;
                name.equals("rty");
        } catch (ArithmeticException e) {
            System.err.println(" division por cero"+e);
        }catch(Exception e){
            System.out.println("Errror "+e);
        }
    }
    
}
