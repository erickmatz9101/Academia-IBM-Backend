package com.ibm.academia.excepciones;

public class Aritmetica {

    public static Integer dividirValores(Integer numerador, Integer denominador)  {

        if (denominador==0)
            throw new OperacionExcepcion("El denominador deber ser mayor a cero");

        return numerador/denominador; //sino se genera la excepcion entonces si divide numerador entre denominador

    }

}

/*En este ejemoplo lo que se va a validar es que el denominador no sea igual a cero*/

/*hrows OperacionExcepcion: debo declrar esta linea de codigo para poder propagar la excepcion y que pueda utilizar mi mensaje no se debe olvidar ese paso sino el
* IDE marcara una advetencia*/


/*El hecho de que el metodo dividirValores sea de manera estatica permite que no necesite instanciar un objeto en mi clase test exception para pdoerlo llamar*/


/*throws OperacionExcepcion: se debe colocar a nivel del metodo siempre y cuando sea de tipo Exception si es de tipo
* RuntimeException no es necesario que se coloque*/