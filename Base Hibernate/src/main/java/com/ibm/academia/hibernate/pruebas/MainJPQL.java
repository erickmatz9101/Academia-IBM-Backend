package com.ibm.academia.hibernate.pruebas;

import com.ibm.academia.hibernate.entidades.manytoone.Persona;
import com.ibm.academia.hibernate.entidades.manytoone.Telefono;
import com.ibm.academia.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class MainJPQL
{
    public static void main(String[] args)
    {
        //JPQL -> JAVA PERSISTENCE QUERY LANGUAGE


        //SQL NATIVO -> select * from personas where codigo = ?

        Session session = HibernateUtil.getSeccionSessionFactory().openSession();

        Query query = session.createQuery("select p from Persona p where p.id = ?1");
        query.setParameter(1, Integer.parseInt("1"));

        Persona persona = (Persona) query.getSingleResult();
        System.out.println(persona.getNombre());

        //SQL NATIVO -> select * from personas p inner join telefono t on p.id = t.id = where p.id = ?

        Query queryDos = session.createQuery("select p.telefonos from Persona p where p.id = :id");
        queryDos.setParameter("id", Integer.parseInt("1"));

        List<Telefono> telefonos = (List<Telefono>) queryDos.getResultList();
        telefonos.forEach(t -> {
            System.out.println(t.getNumeroTelefono());
        });


        session.close();
    }
}
