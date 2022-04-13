package com.ibm.academia.appfactura;

import com.ibm.academia.appfactura.modelos.Cliente;
import com.ibm.academia.appfactura.modelos.Factura;
import com.ibm.academia.appfactura.modelos.ItemFactura;
import com.ibm.academia.appfactura.modelos.Producto;

import java.util.Scanner;

public class MainFactura {
    public static void main(String[] args) {

        Cliente cliente1=new Cliente();
        cliente1.setNumeroDocumento("555-5");
        cliente1.setNombre("Erick Martinez");

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese una descripcion de la factura: ");
        String descripcion= scanner.nextLine();

        /*Creando la factura*/

        Factura factura = new Factura(descripcion, cliente1);

        /*Creando los productos*/

        Producto producto;
        String nombre;
        Float precio;
        Integer cantidad;

        System.out.println();

        /*For que recorre el array para los elementos que se pediran en este caso 5*/

        for (int i = 0; i <5 ; i++) {

            producto=new Producto();

            System.out.println("Ingrese el producto N " +producto.getCodigo() +" :");

            nombre= scanner.nextLine();

            System.out.println("Ingrese el precio: ");
            precio= scanner.nextFloat();
            producto.setPrecio(precio);

            System.out.println("Ingrese la cantidad");
            cantidad=scanner.nextInt();

            ItemFactura item = new ItemFactura(cantidad,producto);
            factura.getItems().add(item);
            System.out.println();

            scanner.nextLine();

            
        }

        System.out.println(factura.geberarDetalle());

    }




}
