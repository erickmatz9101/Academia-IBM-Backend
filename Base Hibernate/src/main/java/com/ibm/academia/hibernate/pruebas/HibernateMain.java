package com.ibm.academia.hibernate.pruebas;

import com.ibm.academia.hibernate.entidades.SimpleEntity;
import com.ibm.academia.hibernate.util.HibernateUtil;
import org.hibernate.Session;

public class HibernateMain
{
    public static void main(String[] args)
    {
        Session session = HibernateUtil.getSeccionSessionFactory().openSession();
        session.beginTransaction();

        //INSERT
        /*SimpleEntity entity = new SimpleEntity();
        entity.setNombre("David");
        session.save(entity);*/

        //UPDATE
        /*SimpleEntity entityUpdate = new SimpleEntity();
        entityUpdate.setCodigo(1);
        entityUpdate.setNombre("update");
        session.update(entityUpdate);*/

        //DELETE
        /*SimpleEntity entityDelete = new SimpleEntity();
        entityDelete.setCodigo(1);
        session.delete(entityDelete);*/

        //READ
        SimpleEntity entityRead = session.get(SimpleEntity.class, 2);
        System.out.println(entityRead.getNombre());

        session.getTransaction().commit();
        session.close();
    }
}