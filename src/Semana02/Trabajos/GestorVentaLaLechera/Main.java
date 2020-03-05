/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestorVentaLaLechera;

import java.util.Scanner;

/**
 *
 * @author Ario1
 */
public class Main {

    public static void main(String[] args) {
        MetodoProducto metodo = new MetodoProducto();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        metodo.crearProducto(new Producto("Leche", 8.00, "Caja", 10200));
        metodo.crearProducto(new Producto("Queso", 10.00, "Molde de kilo", 8000));
        metodo.crearProducto(new Producto("Mantequilla", 3.00, "Barra", 12000));
        String name, telefono, correo, direccion, ruc;
//        metodo.mostrarProducto();

        do {Scanner entrada =new Scanner(System.in);
            System.out.println("-----\t LECHERA -------");
            System.out.println("1. mostrar productos");
            System.out.println("2. Eliminar Producto");
            System.out.println("3. Buscar Producto");
            System.out.println("4. vender Producto");
            System.out.println("5. mostrar Clientes");
            System.out.println("6. Salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    metodo.mostrarProducto();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto que desea eliminar:");
                    String nombre = entrada.nextLine();
                    metodo.elimarProducto(nombre);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del producto que buscar:");
                    String nombre2 = entrada.nextLine();
                    metodo.buscarProducto(nombre2);
                    break;
                case 4:
                    System.out.println("Ingrese tipo cliente :"
                            + "1. Cliente Juridico     2. Cliente Natural ");
                    int tipo = sc.nextInt();
                    if (tipo == 1) {
                        
                        System.out.println("Ingrese su nombre: ");
                        String nombre3 = entrada.nextLine();
                        System.out.println("Ingrese su telefono");
                        telefono = entrada.nextLine();
                        System.out.println("ingrese su correo");
                        correo = entrada.nextLine();
                        System.out.println("ingrese su direccion");
                        direccion = entrada.nextLine();
                        System.out.println("Ingrese su ruc");
                        ruc = entrada.nextLine();
                        metodo.crearClientesJuridicas(new ClientesJuridicas(nombre3, telefono, correo, direccion, ruc), new Fecha());
                        System.out.println("Ingrese producto a comprar:");
                        String nom=entrada.nextLine();
                        System.out.println("Cunatas unidades va llevar");
                        int unidades=entrada.nextInt();
                        metodo.venderProductoJuridico(nom, unidades, new Fecha());

                    } else if (tipo == 2) {
                        System.out.println("Ingrese su nombre: ");
                        String nombre4 = entrada.nextLine();
                        System.out.println("Ingrese su telefono");
                        telefono = entrada.nextLine();
                        System.out.println("ingrese su correo");
                        correo = entrada.nextLine();
                        System.out.println("ingrese su direccion");
                        direccion = entrada.nextLine();
                        System.out.println("Ingrese su ruc");
                        ruc = entrada.nextLine();
                        metodo.crearClientesNaturales(new ClientesNaturales(nombre4, telefono, correo, direccion, ruc));
                        System.out.println("Ingrese producto a comprar:");
                        String nom=entrada.nextLine();
                        System.out.println("Cunatas unidades va llevar");
                        int unidades=entrada.nextInt();
                        metodo.venderProductoNatural(nom, unidades, new Fecha());

                    } else {
                        System.out.println("No existe el tipo de cliente");
                    }

                    break;
                case 5:
                    System.out.println("Clientes Juridico:");
                    metodo.mostrarClientesJuridicos();
                    System.out.println("Clientes Naturales:");
                    metodo.mostrarClientesNaturales();
                    break;

            }

        } while (op != 6);
    }
}
