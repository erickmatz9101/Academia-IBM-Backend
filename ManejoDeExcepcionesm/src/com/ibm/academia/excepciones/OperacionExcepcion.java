package com.ibm.academia.excepciones;

public class OperacionExcepcion extends RuntimeException{

    public OperacionExcepcion(String mensaje){
        super(mensaje); //constructor
    }


}




/*Hay que recordar que Excepcion es padre de las excepciones por eso debemos heredar de ella para poder generar las demas, por lo cual heredamos el constructor*/



/*Para que sea de tipo runtimeexcepctio debo colocar la herencia de runtime en esta clase*/