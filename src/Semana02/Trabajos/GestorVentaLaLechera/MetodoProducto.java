/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestorVentaLaLechera;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ario1
 */
public class MetodoProducto {

    ArrayList<Producto> producto;
    ArrayList<ClientesJuridicas> clientesJuridicas = new ArrayList<ClientesJuridicas>();
    ArrayList<ClientesNaturales> clientesNaturales = new ArrayList<ClientesNaturales>();
    Fecha fecha;

    public MetodoProducto() {
        producto = new ArrayList<Producto>();
        fecha = new Fecha();
    }

    public void crearProducto(Producto p) {
        producto.add(p);
    }

    public void crearClientesJuridicas(ClientesJuridicas c,Fecha f) {
        clientesJuridicas.add(c);
    }

    public void crearClientesNaturales(ClientesNaturales c1) {
        clientesNaturales.add(c1);
    }

    public void mostrarProducto() {
        for (Producto e : producto) {
            System.out.println(e.toString());
        }
    }
    
    public void mostrarClientesJuridicos(){
        for (ClientesJuridicas c : clientesJuridicas) {
            System.out.println(c.toString());
        }
    }
    
    public void mostrarClientesNaturales(){
        for (ClientesNaturales c1 : clientesNaturales) {
            System.out.println(c1.toString());
        }
    }

    public void buscarProducto(String nombre) {
        boolean band = true;
        for (int i = 0; i < producto.size(); i++) {
            if (producto.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(producto.get(i).toString());
                band = false;
            }
        }
        if (band) {
            System.out.println("El producto no existe");
        }
    }

    public void elimarProducto(String nombre) {
        boolean band = true;
        for (int i = 0; i < producto.size(); i++) {
            if (producto.get(i).getNombre().equalsIgnoreCase(nombre)) {
                producto.remove(i);
                band=false;
            }
        }
        if (band) {
            System.out.println("El producto no existe");
        }
    }

    public boolean esMultiplo(int n1, int n2) {
        if (n1 % n2 == 0) {
            return true;
        } else {
            return false;
        }
    }

//    public void factura(ClientesJuridicas c,Fecha f) {
//        System.out.println("--------\tLECHERA------------");
//        System.out.println(c.toString());
////        for (int i = 0; i < producto.size(); i++) {
////            System.out.println("Nombre: " + producto.get(i).getNombre() + "Precio: " + producto.get(i).getPrecio());
////            System.out.println(c.toString());
////        }
////        System.out.println("--------\tLECHERA------------"
////                + producto.toString()+"fecha "+fecha.MostrarFecha());
//
//    }

    public void venderProductoJuridico(String nombre, int cantidad, Fecha f) {
        boolean band = true;
        double precio=0;
//        if (f.getMes() != f.getMes()) {
        if (esMultiplo(cantidad, 100)) {
            for (int i = 0; i < producto.size(); i++) {
                if (producto.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    
                    if (producto.get(i).quedaStock(cantidad) == true) {
                        precio = cantidad * producto.get(i).getPrecio();
                        band = false;
                        System.out.println(" --------\tLECHERA ------------"
                                +"\nNombre : "+producto.get(i).getNombre()+" -----  \tUnidades disponibles :"+producto.get(i).getStock()+
                                "\nUnidades a vender: "+cantidad+"   ----- \tPrecio: $"+producto.get(i).getPrecio()+
                                "\nMonto total a pagar: "+"$/"+precio+"\n fecha: "+f.MostrarFecha());
                        producto.get(i).modificarStock(cantidad);
                    }
                }else{
                    System.out.println("El producto no existe");
                }
            }
        }  
        else if (band) {
            JOptionPane.showMessageDialog(null, "Solo puede comprar productos multiplos de 100 ");
        }
    }

    public void venderProductoNatural(String nombre, int cantidad, Fecha f ) {
        boolean band = true;
        double precio1=0;
        if (cantidad < 100) {
            for (int i = 0; i < producto.size(); i++) {
                if (producto.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    
                    if (producto.get(i).quedaStock(cantidad) == true) {
                        
                        precio1 = cantidad * producto.get(i).getPrecio();
                        band = false;
                        System.out.println(" --------\tLECHERA ------------"
                                +"Nombre : "+producto.get(i).getNombre()+"   \tUnidades disponibles :"+producto.get(i).getStock()+
                                "\nUnidades a vender: "+cantidad+" \tPrecio: $"+producto.get(i).getPrecio()+
                                "Monto A pagar: "+"$/"+precio1+"\n fecha: "+f.MostrarFecha());
                        producto.get(i).modificarStock(cantidad);
                    }
                }else {
                    System.out.println("El producto no existe:");
                }
            }
        } else if (band) {
            JOptionPane.showMessageDialog(null, "Usted no puede comprar mas de 100 de productos. ");
        }
    }

}
