package com.conjuntosresidenciales.dto;

import com.conjuntosresidenciales.entity.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@lombok.Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegistrarUsuariosResponse {
    private Integer codRespuesta;
    private String resultado;
    private Usuario usuario;
}
