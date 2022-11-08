package com.conjuntosresidenciales.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@lombok.Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegistrarUsuarioRequest {
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
