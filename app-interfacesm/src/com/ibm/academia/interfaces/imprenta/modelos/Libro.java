package com.ibm.academia.interfaces.imprenta.modelos;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible
{
    private List<Hoja>paginas;
    private String autor;
    private String titulo;
    private Genero genero; //(Genero hace referencia al ENUM)

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas= new ArrayList<>();
    }

    public List<Hoja> getPaginas() {
        return paginas;
    }

    public void setPaginas(List<Hoja> paginas) {
        this.paginas = paginas;
    }

    @Override

    public String imprimir(){
        StringBuilder sb =  new StringBuilder("Titulo: ");
        sb.append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("Genero: ").append(genero).append("\n");

        paginas.forEach(pag -> {
            sb.append(pag.imprimir()).append("\n"); //recorriendo la lista
        });
        return sb.toString();

    }
}

/*No debo olvidar inicializar en el cosntructor la lista*/
