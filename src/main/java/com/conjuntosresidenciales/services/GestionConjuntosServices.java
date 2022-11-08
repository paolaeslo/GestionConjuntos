package com.conjuntosresidenciales.services;

import com.conjuntosresidenciales.dto.RegistrarUsuarioRequest;
import com.conjuntosresidenciales.dto.RegistrarUsuariosResponse;

public interface GestionConjuntosServices {

    public RegistrarUsuariosResponse registarUsuarioService(RegistrarUsuarioRequest request);

}
