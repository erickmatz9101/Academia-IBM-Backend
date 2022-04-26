package com.ibm.academia.listas;

import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        List<String> colores = Arrays.asList("negro","rojo");



        String datoEntrada="negro";
        if (colores.contains(datoEntrada)){
            System.out.println("Si existe el color");

        }else{
            System.out.println("El color que buscas no se encuentra");
        }



    }
}



/*El metodo contains devuelve un boooleano ya que su funcion unicamnete es indicar si un elemento existe dentro de una lista*/


/*Método IndexOf: Este método devuelve -1 o el índice que el elemento ocupa dentro del ArrayList. Funciona para saber si el elemento existe dentro del ArrayList y para saber
 cuál índice tiene al mismo tiempo*/