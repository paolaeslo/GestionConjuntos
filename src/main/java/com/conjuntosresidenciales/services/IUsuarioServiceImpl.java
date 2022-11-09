package com.conjuntosresidenciales.services;

import com.conjuntosresidenciales.dao.IUsuariosDao;
import com.conjuntosresidenciales.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IUsuarioServiceImpl implements IUsuarioService {

    @Autowired
    IUsuariosDao clienteDao;

    @Override
    @Transactional
    public Usuario save(Usuario usuario) {
        return clienteDao.save(usuario);
    }
}
