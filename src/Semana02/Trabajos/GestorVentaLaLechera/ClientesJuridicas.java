/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestorVentaLaLechera;

/**
 *
 * @author Ario1
 */
public class ClientesJuridicas extends Clientes{
    private String ruc;
    public ClientesJuridicas(String nombre, String telefono, String correo, String direccion,String ruc){
        super(nombre,telefono,correo,direccion);
        this.ruc=ruc;
        
    }


    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    @Override
    public String toString() {
        return super.toString()+"\nRuc: "+ruc;
    }
    
    
}
