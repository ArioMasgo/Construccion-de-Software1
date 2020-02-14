/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana03.Trabajos.Dados;

import java.util.ArrayList;

/**
 *
 * @author Ario1
 */
public class JuegoDeDados {
    ArrayList<Dados> dado= new ArrayList<Dados>();
    
    public void crearDado(Dados d){
        dado.add(d);
    }
    public void tirar(){
        for (int i = 0; i < dado.size(); i++) {
            dado.get(i).setValor((int)(Math.random()*6+1));
        }
    }
    public void imprimir(){
        for (Dados e : dado) {
            System.out.println(e.toString());
        }
    }
    public void Resultado(){
        for (int i = 0; i < 1; i++) {
            if (dado.get(i).getValor()==dado.get(i+1).getValor()&&dado.get(i).getValor()==dado.get(i+2).getValor()) {
                System.out.println("Gano");
            }else{
                System.out.println("Perdio");
            }
        }
    }
    public static void main(String[] args) {
        JuegoDeDados j= new JuegoDeDados();
        j.crearDado(new Dados());
        j.crearDado(new Dados());
        j.crearDado(new Dados());
        j.tirar();
        j.imprimir();
        j.Resultado();
    }
}
