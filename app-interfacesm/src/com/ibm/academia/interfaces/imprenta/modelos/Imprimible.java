package com.ibm.academia.interfaces.imprenta.modelos;

public interface Imprimible
{


    String TEXT_DEFECTO= "Imprimiendo un valor por defecto";
    default String imprimir(){
        return TEXT_DEFECTO;
    }

     static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}

/*lo metodos que se crean en las interfaces deben de colocarse como publicos, lo que se hace en este caso es que
* los que necesiten de esta interfaz la puedan implememtar*/
