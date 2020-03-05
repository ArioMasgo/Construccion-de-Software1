/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana02.Trabajos.GestorVentaLaLechera;

/**
 *
 * @author Ario1
 */
public class ClientesNaturales extends Clientes{
    private String dni;
    public ClientesNaturales(String nombre, String telefono, String correo, String direccion,String dni){
        super(nombre,telefono,correo,direccion);
        this.dni=dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    @Override
    public String toString() {
        return super.toString()+"\nDnI: "+dni;
    }
}
