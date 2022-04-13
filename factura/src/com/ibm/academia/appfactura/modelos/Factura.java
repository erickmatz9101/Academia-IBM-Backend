package com.ibm.academia.appfactura.modelos;

import javax.swing.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura implements Serializable
{
    private Integer folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private List<ItemFactura>items;
    private static Integer utlimoFolio=0;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.folio=++utlimoFolio;
        this.items=new ArrayList<>();
        this.fecha=new Date();
    }

    public Integer getFolio() {
        return folio;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaFactura() {
        return fecha;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fecha = fechaFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemFactura> getItems() {
        return items;
    }

    public void setItems(List<ItemFactura> items) {
        this.items = items;
    }

    public static Integer getUtlimoFolio() {
        return utlimoFolio;
    }

    public static void setUtlimoFolio(Integer utlimoFolio) {
        Factura.utlimoFolio = utlimoFolio;
    }

    /*Metodo para el detalle total del calculo de Factura*/

    public Float calcularTotal(){
        Float total = 0.0f;

        for (ItemFactura item : this.items){

            if (item==null){
                continue;
            }

            total +=     item.calcularImporte();
        }

        return total;

    }

    /*Metodo que genera el detalle de mi factura*/

    public String geberarDetalle(){
        StringBuilder sb = new StringBuilder("Fcatura No:  ");
        sb.append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t No Documento: ")
                .append(this.cliente.getNumeroDocumento())
                .append("\nDescripcion: ")
                .append("\n");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd 'de' MMMM, yyyy");

        sb.append("Fecha Emision: ")
                .append(dateFormat.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t$\tCantidad\t Total\n");


        for (ItemFactura item: this.items){

            if (item==null){
                continue;
            }

            sb.append(item.getProducto().getCodigo())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t")
                    .append(item.getCantidad())
                    .append("\t")
                    .append(item.calcularImporte())
                    .append("\n");
        }

        sb.append("\nGran Total: ")
                .append(calcularTotal());
        return sb.toString();


    }
}

/*Al igual que en la clase anterior para folio y fecha no se necesita el metodo set debido a que sera autoincremeental y se esta asignando
* a la variable para que asi sea*/

/*En el caso de la lista tambien se debe comocalr en el metodo contructor para poder inciicializarla, sino no se podra acceder a ella,
* para el mismo caso y con el mismo proposito se inciializa la fecha*/

/*Para el metodo calcular total la finalidad del ciclo foreach es poder recorrer cada uno de los items del array para poder hacer los calculos del
* total y de igaul manera en este ejemplo pedir que se ingresen un maximo de 5 articulos*/

/*Con el if lo que se valida es que si alguno de los elementos del array esta vacio (null) entonces por medio del continue siga el ciclo hasta encontrar
* lo que no este vacio dentro d emi arreglo*/

/*La idea de usar la Clase String Builder es que como se va a hacer en una sola iteracion y se van a concatener varios strings los mismos sean
* mostrados (concatendos) en el detalle de la factura, ademas de que se habla de una cestion de rendimiento del sistema*/


/*La clase SimpleDateFormat es la que permite darle formato a la fecha solo hay que tener cuidado la m minuscula hace refrencia a minuto y la mayuscula al mes*/

