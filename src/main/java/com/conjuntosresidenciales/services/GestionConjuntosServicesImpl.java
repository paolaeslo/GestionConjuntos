package com.conjuntosresidenciales.services;

import com.conjuntosresidenciales.dto.RegistrarUsuarioRequest;
import com.conjuntosresidenciales.dto.RegistrarUsuariosResponse;
import org.springframework.stereotype.Service;

@Service
public class GestionConjuntosServicesImpl implements GestionConjuntosServices{
    @Override
    public RegistrarUsuariosResponse registarUsuarioService(RegistrarUsuarioRequest request) {
        return RegistrarUsuariosResponse.builder()
                .codRespuesta(0).resultado("Usuario registrado con exito").build();
    }
}
