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
@Table(name = "socios")
public class Socio implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 40)
    private String nombre;

    @Column(name = "numero_documento", unique = true, length = 12)
    private String numeroDocumento;

    //@OneToOne(mappedBy = "socio", cascade = CascadeType.ALL)
    @OneToOne(mappedBy = "socio", cascade = CascadeType.ALL)
    private Carnet carnet;
}