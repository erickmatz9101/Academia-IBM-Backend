package com.ibm.academia.hibernate.entidades.manytoone;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "personas")
public class Persona implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 15)
    private String nombre;

    public Persona(Integer id, String nombre)
    {
        this.id = id;
        this.nombre = nombre;
    }

    //fetch- Significa de que manera voy a traer los elementos, LAZY(carga perezosa) - EAGER(carga completa)
    //@OneToMany(mappedBy = "persona", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
    private List<Telefono> telefonos;
}
