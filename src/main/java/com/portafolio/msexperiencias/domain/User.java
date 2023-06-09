package com.portafolio.msexperiencias.domain;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Builder(toBuilder = true)
@Table(
        name = "users",
        schema = "portafolio"
)
public class User implements Serializable {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellidos", nullable = false)
    private String apellidos;

    @Column(name = "pais", nullable = false)
    private String pais;

    @Column(name = "provincia", nullable = false)
    private String provincia;

    @Column(name = "ciudad", nullable = false)
    private String ciudad;

    @Column(name = "latitud", nullable = false)
    private String latitud;

    @Column(name = "longitud", nullable = false)
    private String longitud;

    @Column(name = "mail", nullable = false)
    private String mail;
}

