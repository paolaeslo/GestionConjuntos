package com.conjuntosresidenciales.controller;

import com.conjuntosresidenciales.dto.RegistrarUsuarioRequest;
import com.conjuntosresidenciales.dto.RegistrarUsuariosResponse;
import com.conjuntosresidenciales.services.GestionConjuntosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api")
public class GestionConjuntosController {

    @Autowired
    private GestionConjuntosServices services;

    @PostMapping("/registrar-usuario")
    public ResponseEntity<RegistrarUsuariosResponse> registrarUsuario(@RequestBody RegistrarUsuarioRequest request) {
        return ResponseEntity.ok(services.registarUsuarioService(request));
    }

}
