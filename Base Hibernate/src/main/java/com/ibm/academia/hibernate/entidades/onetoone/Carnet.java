package com.ibm.academia.hibernate.entidades.onetoone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "carnets")
public class Carnet implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "numero", length = 10, unique = true)
    private String numero;

    @OneToOne
    @JoinColumn(name = "socio_id", foreignKey = @ForeignKey(name = "FK_SOCIO_ID"))
    private Socio socio;
}