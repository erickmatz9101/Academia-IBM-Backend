package com.ibm.academia.appfactura.modelos;

import java.io.Serializable;

public class ItemFactura implements Serializable
{
    private Integer cantidad;
    private Producto producto;

    public ItemFactura(Integer cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /*Creando el métodp para calcular el importe*/

    public Float calcularImporte(){
        return this.cantidad * this.producto.getPrecio();

    }
}

/*En esta clase se ven declardas las relaciones que hay entre las clases ya que una factura puede tener un producto */

/*No olvides que para acceder al precio del producto debes utilizar el método get para poder manipular ese dato*/