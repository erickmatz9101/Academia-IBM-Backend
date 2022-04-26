package com.ibm.academia.hibernate.pruebas;

import com.ibm.academia.hibernate.entidades.onetoone.Carnet;
import com.ibm.academia.hibernate.entidades.onetoone.Socio;
import com.ibm.academia.hibernate.util.HibernateUtil;
import org.hibernate.Session;

public class MainOneToOne
{
    public static void main(String[] args)
    {
        Session session = HibernateUtil.getSeccionSessionFactory().openSession();
        session.beginTransaction();

        Socio socio = new Socio();
        socio.setNombre("Pedro");
        socio.setNumeroDocumento("123456789");

        Carnet carnet = new Carnet();
        carnet.setNumero("00000001");

        socio.setCarnet(carnet);

        session.save(socio);
        session.getTransaction().commit();
        session.close();
    }
}
