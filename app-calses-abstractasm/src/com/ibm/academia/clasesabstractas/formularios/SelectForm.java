package com.ibm.academia.clasesabstractas.formularios;

import com.ibm.academia.clasesabstractas.formularios.seleccion.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm
{
    private List<Opcion>opciones; //genera las opciones de la lista

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones=new ArrayList<Opcion>(); //Inicializando la lista sino no puede agregar los valores
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public List<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<Opcion> opciones) {
        this.opciones = opciones;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb =  new StringBuilder("<select ");
        sb.append("name='")
                .append(this.nombre)
                .append("'>");

        for(Opcion opcion: this.opciones)
        {
            sb.append("\n<option value='")
                    .append(opcion.getValor())
                    .append("'");

            if(opcion.isSeleccionado())
            {
                sb.append(" seleccionado");
                this.valor = opcion.getValor();
            }
            sb.append(">")
                    .append(opcion.getNombre())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
