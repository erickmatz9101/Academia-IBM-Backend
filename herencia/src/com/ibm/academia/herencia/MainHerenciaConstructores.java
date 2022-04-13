package com.ibm.academia.herencia;

import com.ibm.academia.herencia.modelos.Alumno;
import com.ibm.academia.herencia.modelos.AlumnoInternacional;
import com.ibm.academia.herencia.modelos.Persona;
import com.ibm.academia.herencia.modelos.Profesor;

public class MainHerenciaConstructores {
    public static void main(String[] args) {

        //Creando el Objeto alumno por medio de los constructores

        Alumno alumno = new Alumno("Erick","Martinez",20,"Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematicas(4.9);
        alumno.setCorreoElectronico("erick.martinez9101@outlook.com");

        //Creando objeto de tipo AlumnoInternacional

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Peter","Goldsin","Australia");
        alumnoInternacional.setEdad(13);
        alumnoInternacional.setInstitucion("Instituto Nacional");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaCastellano(6.2);
        alumnoInternacional.setNotaHistoria(5.8);
        alumnoInternacional.setNotaMatematicas(6.5);
        alumnoInternacional.setCorreoElectronico("aluno1.internacional.com");

        //Creando los objetos de tipo Profesor

        Profesor profesor =new Profesor("Lucio","Perez","Matematicas");
        profesor.setCorreoElectronico("profesor.unam.mx");

        System.out.println("----------- -----------------");

        imprimir(alumno);
        imprimir(alumnoInternacional);
        imprimir(profesor);

    }



        public static void imprimir(Persona persona){
            System.out.println("Imprimiendo datos en comun de tipo Persona ");
            System.out.println("Nombre "+persona.getNombre()+
                    ", Edad: "+persona.getEdad() +
                    ",Correo "+persona.getCorreoElectronico());

            //Creando el método que imprime de acuerdo a si es o no el tipo de persona

            if (persona instanceof Alumno){
                System.out.println("Imprimiendo los datos de tipo Alumno");
                System.out.println("Institucion: "+((Alumno) persona).getInstitucion());
                System.out.println("Nota Matematicas: "+((Alumno) persona).getNotaHistoria());
                System.out.println("Nota Castellano: "+((Alumno) persona).getNotaCastellano());

                if (persona instanceof AlumnoInternacional){
                    System.out.println("Imprimiendo los datos de tipo Alumno Internacional: ");
                    System.out.println("Nota Idiomas: "+((AlumnoInternacional) persona).getNotaIdiomas());
                    System.out.println("Pais: "+((AlumnoInternacional) persona).getPais());
                }

                if (persona instanceof Profesor){
                    System.out.println("Imprimeindo los datos de tipo Profesor: ");
                    System.out.println("Asignatura: "+persona.getCorreoElectronico());
                }
            }
        }
}
