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
public class Ejercicio03 {
    public static void main(String[] args) throws Exception {
        try {
            MiPropioError er = new MiPropioError("error de samnatica");
//            Exception e = new Exception("Mi propio error!! ");
        throw er;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
class MiPropioError extends Exception{
    public MiPropioError(String text){
        super(text);
    }
}
