package com.conjuntosresidenciales.services;

import com.conjuntosresidenciales.entity.Usuario;
import com.conjuntosresidenciales.dto.RegistrarUsuariosResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

@Service
public class GestionConjuntosServicesImpl implements GestionConjuntosServices{

    @Autowired
    IUsuarioService usuarioService;

    @Override
    public RegistrarUsuariosResponse registarUsuarioService(Usuario request) {
        Usuario usuario=usuarioService.save(request);
        if(usuario ==null){
            return RegistrarUsuariosResponse.builder()
                    .codRespuesta(-1).resultado("No se ha podido registrar el usuario")
                    .usuario(null).build();
        }
        return RegistrarUsuariosResponse.builder()
                .codRespuesta(0).resultado("Usuario registrado con exito")
                .usuario(usuario).build();
    }
}
