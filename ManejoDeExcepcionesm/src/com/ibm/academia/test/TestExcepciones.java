package com.ibm.academia.test;

import com.ibm.academia.excepciones.Aritmetica;

public class TestExcepciones {
    public static void main(String[] args) {

        /*Integer resultado=0;

        try{

            resultado= 10/0;


        }catch (Exception e){

            e.printStackTrace(System.out); //lanza la traza de la pila de las excepciones se coloca el System.out para que el resultado vaya a consola

        }

        System.out.println(resultado);*/

        Integer resultado=0;
        //resultado=Aritmetica.dividirValores(10,0);
        //System.out.println(resultado);

       try{

            resultado=Aritmetica.dividirValores(10,0);
            System.out.println(resultado);

        }catch (Exception e){

            //e.printStackTrace(System.out);

            System.out.println(e.getMessage());

        }

        finally{

           System.out.println("Simepre me ejecuto aunque no tenga excepcion");

        }


    }
}

/*Line 34 si bien si me muestra la excepcion el consola lo que yo deseo es poder visialuzar mi mensaje por eso lo mando a llamar con el get*/

/*Linea 28 debo mandar a imprimir el resultado*/



/*Cuando los excepciones son de tipo Runtime Excepcion no es necesario que coloque el try catch*/


/*lineas 23 a 25 solo debo colocar la estructura asi como esta no es necesario el try catch, solo hay que recordar que RuntimeException
* puede terminar de manera abrupta, y la ventaja es que es un codigo mas limpio.*/