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
@Table(name = "usuarios")
public class Usuario implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name", nullable = false, length = 20, unique = true)
    private String userName;

    public Usuario(Integer id, String userName)
    {
        this.id = id;
        this.userName = userName;
    }

    @ManyToMany
    @JoinTable(
            name = "usuario_publicacion",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "publicacion_id")
    )
    private List<Publicacion> publicaciones;
}