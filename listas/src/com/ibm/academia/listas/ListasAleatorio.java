package com.ibm.academia.listas;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListasAleatorio {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);

        Random numeroAleatorio = new Random();
        int numeroRuleta= numeros.get(numeroAleatorio.nextInt(numeros.size()));
        System.out.println(numeroRuleta);

        List<String>colores=Arrays.asList("blanco", "azul","rojo","negro");
        Random colorAleatorio = new Random();
        String colorRuleta= colores.get(colorAleatorio.nextInt(colores.size()));
        System.out.println(colorRuleta);
    }

/*Esta es la forma que mas me conviene para resolver mi ejercicio pues los demas metodos me dvuelven la posicion, pero
* esta forma me devuelve uno de los valores del array*/

}
