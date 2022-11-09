package com.conjuntosresidenciales.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@lombok.Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="usuarios_conjunto")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoDocumentoResidente;
    private Integer numeroDocumentoResidente;
    private String nombreResidente;
    private Integer torre;
    private Integer apartamento;
    private String propietario;
    private String email;
    private String telefono;
    private String genero;
}
