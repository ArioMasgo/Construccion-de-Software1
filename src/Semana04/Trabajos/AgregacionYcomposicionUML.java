/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana04.Trabajos;

import java.util.ArrayList;

/**
 *
 * @author Ario1
 */
class Cliente{
    private String nombre;
    private String tipoCliente;

    public Cliente(String nombre, String tipoCliente) {
        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", tipoCliente=" + tipoCliente + '}';
    }
    
    
    
}
class Empleado{
    private String nombre;
    private int sueldo;

    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSueldo() {
        return sueldo;
    }
    

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
    
    
}
class Empreza{
    private String nombre;
    private ArrayList<Empleado> empleado;
    private ArrayList<Cliente> cliente;

    public Empreza(String nombre) {
        this.nombre = nombre;
        empleado = new ArrayList<>();
    }
    public void AgregarEmpleado(Empleado e){
        this.empleado.add(e);
    }
    public void EliminarEmpleado(Empleado e){
        this.empleado.remove(e);
    }
    public void AgregarClinete(Cliente c){
        cliente = new ArrayList<>();
        cliente.add(c);
    }

    public String MostrarEmpleado(){
        String cadena="";
        for (Empleado e : empleado) {
            cadena=e.toString();
        }
        return cadena;
    }
    public String MostrarClintes(){
        String cadena="";
        for (Cliente c : cliente) {
            cadena= c.toString();
        }
        return cadena;
    }
    
    public void MostrarEmpresa(){
        System.out.println(this.nombre+"\n"+MostrarClintes()+MostrarEmpleado());
    }

}

public class AgregacionYcomposicionUML {
    public static void main(String[] args) {
        Empreza em = new Empreza("Sac");
        em.AgregarEmpleado(new Empleado("Luis", 3000));
        em.AgregarClinete(new Cliente("pedro", "preferencial"));
        Empreza em1 = new Empreza("SA");
        em1.AgregarEmpleado(new Empleado("JUan", 3000));
        em1.AgregarClinete(new Cliente("federico", "preferencial"));
        em1.MostrarEmpresa();
        em.MostrarEmpresa();
    }
}
