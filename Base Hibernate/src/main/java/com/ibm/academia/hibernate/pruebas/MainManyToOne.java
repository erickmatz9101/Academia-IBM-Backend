package com.ibm.academia.hibernate.pruebas;

import com.ibm.academia.hibernate.entidades.manytoone.Persona;
import com.ibm.academia.hibernate.entidades.manytoone.Telefono;
import com.ibm.academia.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Arrays;

public class MainManyToOne
{
    public static void main(String[] args)
    {
        Session session = HibernateUtil.getSeccionSessionFactory().openSession();
        session.beginTransaction();

        Persona juan = new Persona(null, "Juan");
        Persona mariano = new Persona(null, "Mariano");

        Telefono celularJuan = new Telefono(null, "123456789");
        Telefono telefonoFijoJuan = new Telefono(null, "3334445");
        Telefono celularMariano = new Telefono(null, "987654321");
        Telefono telefonoFijoMariano = new Telefono(null, "1234567");

        celularJuan.setPersona(juan);
        telefonoFijoJuan.setPersona(juan);
        celularMariano.setPersona(mariano);
        telefonoFijoMariano.setPersona(mariano);

        juan.setTelefonos(Arrays.asList(celularJuan, telefonoFijoJuan));
        mariano.setTelefonos(Arrays.asList(celularMariano, telefonoFijoMariano));

        session.saveOrUpdate(juan);
        session.saveOrUpdate(mariano);

        /*Persona persona = session.get(Persona.class, 1);
        persona.getTelefonos().forEach(t ->{
            System.out.println(t.getNumeroTelefono());
        });*/

        /*session.getTransaction().commit();*/
        session.close();
    }
}
