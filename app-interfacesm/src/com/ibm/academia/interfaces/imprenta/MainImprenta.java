package com.ibm.academia.interfaces.imprenta;

import com.ibm.academia.interfaces.imprenta.modelos.*;

import static com.ibm.academia.interfaces.imprenta.modelos.Imprimible.imprimir;

import java.util.Arrays;

public class MainImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo( new Persona("Erick","Martinez"),"Ingeniero en computacion", "Resumen laboral....");
        cv.setExperiencias(Arrays.asList("Java", "Oracle DBA", "Spring Framework", "Desarrollo Fullstack", "Angular"));

        Libro libro = new Libro(new Persona("Erich","Gamma"), "Patrones de Diseño", Genero.PROGRAMACION);
        Pagina singleton = new Pagina("Patron Singleton");
        Pagina observador = new Pagina("Patron observador");
        Pagina factory = new Pagina("Patron factory");
        Pagina composite= new Pagina("Patron composite");
        Pagina facade = new Pagina("Patron facade");

        libro.setPaginas(Arrays.asList(singleton,observador, factory,composite, facade));


        Informe informe = new Informe( new Persona("Martin", "Fowler"), new Persona("James", "Gosling"), "Microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        System.out.println(Imprimible.TEXT_DEFECTO);

    }


}

/*El metodo imprimir hace referencia al que esta declarado dentro de la clase abstracta pero a su vez tambien a las demas clases donde se implemento
* ya que hay que recordar que se trata de un metodo abstracto.*/

/*Para no mandar a llamar el metodo imprimir todas las veces que sea necesario nos apoyamos para ello de las Interfaces. */

/*Para poder sobreescribir el metodo en mis demas clases debo de colocar @override sino no me deja implementarlo*/


/*Como la clase libro no hereda de hoja no puedo hacer uso de su metodo por eso si le paso como parametro libo me marca errro para ello hacemos uso de }
* las interfaces*/

/*Dentro del metodo imprimir paso como parametro el nombre de mi iterfaz para poderla implementar por lo cual debo
* de llamar en cada clase a mi interfaz para poder hacer uso de ella y el metodo Imprimible*/

/*Al importar a la Interfaz denntro del main junto con el metodo ya no tengo que hacer referencia al metodo sino a imprimir*/