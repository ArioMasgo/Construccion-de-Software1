/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana03.teorico;

import java.util.ArrayList;

/**
 *
 * @author Ario1
 */
class worker {

    private String nombre;
    private String codigo;
    private String Arealaboral;
    private double sueldo;
    private int hextras;
    private String afiliacion;

    public worker(String nombre, String codigo, String Arealaboral, double sueldo, int hextras, String afiliacion, double montosueldobruto, double sueldoneto) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.Arealaboral = Arealaboral;
        this.sueldo = sueldo;
        this.hextras = hextras;
        this.afiliacion = afiliacion;
        this.montosueldobruto = montosueldobruto;
        this.sueldoneto = sueldoneto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getArealaboral() {
        return Arealaboral;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double montoExtras() {
        return (sueldo * hextras) / 240;
    }

    public double montoSeguro() {
        if (afiliacion.equalsIgnoreCase("AFP")) {
            return sueldo * 0.17;
        } else {
            return sueldo * 0.05;
        }
    }

    public double montoSalud() {
        return sueldo * 0.3;
    }

    public double montodeDescuento() {
        return this.montoSeguro() + this.montoSalud();
    }

    public double montoSueldoBruto() {
        return this.sueldo + this.montoExtras();
    }

    public double SueldoNeto() {
        return this.montosueldobruto - this.montodeDescuento();
    }

    double montosueldobruto;
    double sueldoneto;

    @Override
    public String toString() {
        return "worker{" + "nombre=" + nombre + ", codigo=" + codigo + 
                ", Arealaboral=" + Arealaboral + "\nsueldo=" + sueldo + "\nhextras=" + hextras + ", "
                + "\nafiliacion=" + afiliacion + ", \nmontosueldobruto=" + montosueldobruto + ", "
                + "\nsueldoneto=" + sueldoneto + 
                "\nmonto extras: "+montoExtras()+"\nmontoSeguro: "+montoSeguro()+
                "\nmontoSalud: "+montoSalud()+"\nmontodeDescuento: "+montodeDescuento()+
                "\nmontosueldobruto: "+montoSueldoBruto()+"\nsueldoNeto: "+SueldoNeto();
        
    }
}
class PERSONA{
    ArrayList<worker> obj = new ArrayList<>();
    double total=0;
    String nombre="";
    double max=0,suma=0,promedio=0;
    
    public void PromedioSueldoMArketing(){
        int con=0;
        for (int i = 0; i < obj.size(); i++) {
            if (obj.get(i).getArealaboral().equalsIgnoreCase("Marketing")) {
                suma=suma+obj.get(i).SueldoNeto();
                con++;
            }
        }
        promedio=suma/(double)con;
        System.out.println("B: El promedio de sus sueldos del Area de MArketing es  :"+promedio);
        
       
    }
    public void Total(){
        for (int i = 0; i < obj.size(); i++) {
            total=total+obj.get(i).montoSueldoBruto();
        }
        System.out.println("La empresa paga en total:"+total);
    }
    public void MayorSueldoNeto(){
        for (int i = 0; i < obj.size(); i++) {
            
            if (obj.get(i).SueldoNeto()>max) {
                max=obj.get(i).SueldoNeto();
                nombre=obj.get(i).getNombre();
            }
            
        }System.out.println("A: El nombre del mayor sueldo neto: "+nombre);
    }
    
    public void crearPersona(worker k){
        obj.add(k);
    }
    public void mostrarPersona(){
        for (worker e : obj) {
            System.out.println(e.toString());
            System.out.println("\n******************************");
        }
        
    }
    
}

public class Ejercicio09 {

    public static void main(String[] args) {
        String laboral[] = {"Sistemas", "Administracion", "Marketing"};
        String afi[] = {"AFP", "SNP"};
        PERSONA per = new PERSONA();
        per.crearPersona(new worker("pedro", "09568", laboral[aleatorio(0, 3)], 3000.0, 20, afi[aleatorio(0, 2)], 4000.0, 2500.0));
        per.crearPersona(new worker("Juan", "09568", laboral[aleatorio(0, 3)], 3500.0, 20, afi[aleatorio(0, 2)], 4000.0, 2500.0));
        per.crearPersona(new worker("pepe", "09568", laboral[aleatorio(0, 3)], 2000.0, 20, afi[aleatorio(0, 2)], 4000.0, 2500.0));
        per.crearPersona(new worker("Rosa", "09568", laboral[aleatorio(0, 3)], 3100.0, 20, afi[aleatorio(0, 2)], 4000.0, 2500.0));
        per.crearPersona(new worker("Maria", "09568", laboral[aleatorio(0, 3)], 1800.0, 20, afi[aleatorio(0, 2)], 4000.0, 2500.0));
        per.crearPersona(new worker("Roberto", "09568", laboral[aleatorio(0, 3)], 5200.0, 20, afi[aleatorio(0, 2)], 4000.0, 2500.0));
        per.mostrarPersona();
        System.out.println("--------------");
        per.Total();
        System.out.println("------------");
        per.MayorSueldoNeto();
        System.out.println("-----------");
        per.PromedioSueldoMArketing();
    }
    static int aleatorio(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
