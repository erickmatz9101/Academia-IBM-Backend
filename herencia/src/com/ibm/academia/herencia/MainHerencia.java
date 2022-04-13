package com.ibm.academia.herencia;

import com.ibm.academia.herencia.modelos.Alumno;
import com.ibm.academia.herencia.modelos.AlumnoInternacional;
import com.ibm.academia.herencia.modelos.Profesor;

public class MainHerencia {
    public static void main(String[] args) {
        //Creando los objetos de tipo alumno

        System.out.println("Creando la instancia de la clase Alumno");
        Alumno alumno = new Alumno();
        alumno.setNombre("Erick");
        alumno.setApellido("Martinez");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematicas(4.9);

        //Creando los objetos de tipo Profesor

        System.out.println("Creando la instancia de la clase Profesor");
        Profesor profesor =new Profesor();
        profesor.setNombre("Lucio");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matematicas");

        //Creando objeto de tipo AlumnoInternacional

        System.out.println("Creando la instancia de la clase AlumnoInternacional");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Peter");
        alumnoInternacional.setApellido("Goldsin");
        alumnoInternacional.setPais("Australia");
        alumnoInternacional.setEdad(13);
        alumnoInternacional.setInstitucion("Instituto Nacional");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaCastellano(6.2);
        alumnoInternacional.setNotaHistoria(5.8);
        alumnoInternacional.setNotaMatematicas(6.5);


        //Imprimiendo los datos de profesor, alumno y alumnoInternacional

        System.out.println(alumno.getNombre()+
                " "+alumno.getApellido()+
                " "+alumno.getInstitucion());

        System.out.println("Profesor: "+profesor.getAsignatura()+
                ": "+profesor.getNombre()+
                " "+profesor.getApellido());


        
    }
}
