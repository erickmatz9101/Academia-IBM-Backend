package com.ibm.academia.hibernate.entidades.manytoone;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "telefonos")
public class Telefono implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Telefono(Integer id, String numeroTelefono)
    {
        this.id = id;
        this.numeroTelefono = numeroTelefono;
    }

    @Column(name = "numero_telefono", unique = true, length = 10)
    private String numeroTelefono;

    @ManyToOne(optional = false)
    @JoinColumn(name = "persona_id", foreignKey = @ForeignKey(name = "FK_PERSONA_ID"))
    private Persona persona;
}
