package com.ibm.academia.hibernate.pruebas;

import com.ibm.academia.hibernate.entidades.manytomany.Publicacion;
import com.ibm.academia.hibernate.entidades.manytomany.Usuario;
import com.ibm.academia.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Arrays;

public class MainManyToMany
{
    public static void main(String[] args)
    {
        Session session = HibernateUtil.getSeccionSessionFactory().openSession();
        session.beginTransaction();

        Usuario admin = new Usuario(null, "admin");
        Usuario user = new Usuario(null, "usuario");

        Publicacion publicacionUno = new Publicacion(null, "primera publicacion");
        Publicacion publicacionDos = new Publicacion(null, "segunda publicacion");
        Publicacion publicacionTres = new Publicacion(null, "tercera publicacion");
        Publicacion publicacionCuatro = new Publicacion(null, "cuarta publicacion");

        admin.setPublicaciones(Arrays.asList(publicacionUno, publicacionTres));
        user.setPublicaciones(Arrays.asList(publicacionDos, publicacionCuatro, publicacionTres, publicacionUno));


        /*session.saveOrUpdate(admin);
        session.saveOrUpdate(user);
        session.saveOrUpdate(publicacionUno);
        session.saveOrUpdate(publicacionDos);
        session.saveOrUpdate(publicacionTres);
        session.saveOrUpdate(publicacionCuatro);*/

        Usuario usuario = session.get(Usuario.class, 5);
        usuario.getPublicaciones().forEach(p -> {
            System.out.println(p.getTexto());
        });


        session.getTransaction().commit();
        session.close();
    }
}
