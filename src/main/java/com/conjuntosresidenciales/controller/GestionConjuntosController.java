package com.conjuntosresidenciales.controller;

import com.conjuntosresidenciales.entity.Usuario;
import com.conjuntosresidenciales.dto.RegistrarUsuariosResponse;
import com.conjuntosresidenciales.services.GestionConjuntosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api")
public class GestionConjuntosController {

    @Autowired
    private GestionConjuntosServices services;

    @PostMapping("/registrar-usuario")
    public ResponseEntity<RegistrarUsuariosResponse> registrarUsuario(@RequestBody Usuario request) {
        BindingResult result=null;
        return ResponseEntity.ok(services.registarUsuarioService(request));
    }

}
