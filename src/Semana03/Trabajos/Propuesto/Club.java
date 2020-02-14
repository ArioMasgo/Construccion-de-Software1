/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana03.Trabajos.Propuesto;

/**
 *
 * @author Ario1
 */
public class Club {
    private Socio socio1,socio2,socio3;
    public Club(){
        socio1 = new Socio("pedro", 19);
        socio2 = new Socio("Pepe", 36);
        socio3 = new Socio("federico", 45);
    }
    public void imprimir(){
        System.out.println(
                socio1.toString()+
        socio2.toString()+
        socio3.toString());
    }
    public void Mayor(){
        System.out.println("\nEL mayor es:");
        if (socio1.getAnio()>socio2.getAnio()&&socio1.getAnio()>socio3.getAnio()) {
            System.out.println(socio1.toString());
        }else if (socio2.getAnio()>socio1.getAnio()&&socio2.getAnio()>socio3.getAnio()) {
            System.out.println(socio2.toString());
        }else if (socio3.getAnio()>socio1.getAnio()&&socio3.getAnio()>socio2.getAnio()) {
            System.out.println(socio3.toString());
        }
    }
    
    public static void main(String[] args) {
        Club club = new Club();
        club.imprimir();
        club.Mayor();
    }
}
