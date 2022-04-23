package com.ibm.academi.colecciones;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
        //Listas:

        List miLista= new ArrayList(); //Sintaxis de la lista

        /*Agregando elementos a la lista*/

        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        for (int i = 0; i <miLista.size() ; i++) {

            System.out.println("Posicion: "+i+"__"+miLista.get(i));
            
        }

        /*Haciendo el recorrido por foreach*/

        for(Object elemento: miLista){  /*Cuando no especifico el tipo de dato debo de colocar Object si lo especifico dbo de ponerlo ahi*/
            System.out.println(elemento);
        }

        /*Recorriendo la Lista con Lambdas*/

        miLista.forEach(e->{
            System.out.println("lambda: "+e);
        });

    }



}

/*En el ciclo for con miLista lo que se hace es obtener los elementos de la lista y en el get con (i) lo que se obtiene es la psosicion del elemento*/

/*En las listas si puede haber elementos repetidos, ademas de que en el orden que se van insertando es el orden en el que aparecen*/



/*En el uso de lambdas lo que se hace es colocar el nombre de la lista foreach y decirle que recorra cada uno de los elementos (e), cuando se manda a imprimir lo que se
* coloca es el elemento (e)*/
