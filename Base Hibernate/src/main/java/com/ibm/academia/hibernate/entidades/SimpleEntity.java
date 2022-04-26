package com.ibm.academia.hibernate.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "entidades")
public class SimpleEntity implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(name = "descripcion", nullable = true, unique = true, length = 70)
    private String nombre;

    private String usuarioCreacion;
    private Date fechaCreacion;
}