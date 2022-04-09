package com.ibm.academia.appfactura.modelos;

import java.io.Serializable;

public class Producto implements Serializable
{
    private Integer codigo;
    private String nombre;
    private Float precio;
    private static Integer ultimoCodigo=0;

    public Producto() {
        this.codigo= ++ultimoCodigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
}

/*Al ser autoincrmenetal no es necesario hacer uso del método set ya que se hará de forma automática*/

/*el método constructor lo que hace es generar la secuencia del código */
