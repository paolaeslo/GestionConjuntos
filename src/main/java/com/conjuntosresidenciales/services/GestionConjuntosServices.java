package com.conjuntosresidenciales.services;

import com.conjuntosresidenciales.entity.Usuario;
import com.conjuntosresidenciales.dto.RegistrarUsuariosResponse;
import org.springframework.validation.BindingResult;

public interface GestionConjuntosServices {

    public RegistrarUsuariosResponse registarUsuarioService(Usuario request);

}
