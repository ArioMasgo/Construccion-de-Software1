/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana03.Trabajos.Banco;

import java.util.ArrayList;

/**
 *
 * @author Ario1
 */
public class Banco {

    ArrayList<Cliente> cliente = new ArrayList<Cliente>();
    int montototal = 0;

    public void AgregarCliente(Cliente c) {
        cliente.add(c);
    }

    public void retirar(int monto, String name) {
        for (int i = 0; i < cliente.size(); i++) {
            if (cliente.get(i).getNombre().equalsIgnoreCase(name)) {
                if (cliente.get(i).getMonto() < 0) {
                    cliente.get(i).setMonto(cliente.get(i).getMonto() - monto);
                } else {
                    System.out.println("no tiene dinero para retirar");
                }
            }

        }
    }

    public void depositar(int monto, String name) {
        for (int i = 0; i < cliente.size(); i++) {
            if (cliente.get(i).getNombre().equalsIgnoreCase(name)) {
                cliente.get(i).setMonto(cliente.get(i).getMonto() + monto);
            }

        }
    }

    public void montoTotales() {
        for (int i = 0; i < cliente.size(); i++) {
            montototal = montototal + cliente.get(i).getMonto();
        }
        System.out.println("Monto obtenido total: " + montototal);
    }

    public void mostrar() {
        for (Cliente c : cliente) {
            System.out.println(c.toString());
        }
    }

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.AgregarCliente(new Cliente("Luis"));
        banco.AgregarCliente(new Cliente("rodolfo"));
        banco.AgregarCliente(new Cliente("pedro"));
        banco.depositar(200,"luis");
        banco.depositar(400,"rodolfo");
        banco.depositar(500,"pedro");
        banco.mostrar();
        banco.montoTotales();
        banco.retirar(300, "luis");
    }
}
