package com.ibm.academia.hibernate.entidades.manytomany;

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
@Table(name = "publicaciones")
public class Publicacion implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "texto", nullable = false)
    private String texto;

    public Publicacion(Integer id, String texto)
    {
        this.id = id;
        this.texto = texto;
    }

    @ManyToMany(mappedBy = "publicaciones")
    private List<Usuario> usuarios;
}
