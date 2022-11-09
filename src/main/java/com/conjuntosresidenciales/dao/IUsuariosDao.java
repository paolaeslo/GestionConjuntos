package com.conjuntosresidenciales.dao;

import com.conjuntosresidenciales.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuariosDao extends CrudRepository<Usuario,Long> {
}
