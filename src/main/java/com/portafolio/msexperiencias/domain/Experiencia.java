package com.portafolio.msexperiencias.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Builder(toBuilder = true)
@Table(
        name = "experiences",
        schema = "portafolio"
)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Experiencia {

    @Id
    @Column(name = "experience_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "puesto_trabajo", nullable = false)
    private String puestoTrabajo;

    @Column(name = "ciudad", nullable = false)
    private String ciudad;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private User user;
}