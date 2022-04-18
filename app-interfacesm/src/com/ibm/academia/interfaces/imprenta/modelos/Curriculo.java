package com.ibm.academia.interfaces.imprenta.modelos;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible
{
    private String persona;
    private String carrera;
    private List<String>experiencias;

    public Curriculo( String persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public List<String> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(List<String> experiencias) {
        this.experiencias = experiencias;
    }

    @Override
    public String imprimir() {

        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera).append("\n")
                .append("Exoeriencia: \n");

        experiencias.forEach(exp->{
            sb.append("-").append(exp).append("\n");
        });
        return sb.toString();
    }
}
