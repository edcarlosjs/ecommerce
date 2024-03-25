package com.techchallenge.ecommerce.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techchallenge.ecommerce.entities.Usuario;

@Service
@Transactional
public interface UsuarioService {
	Usuario create(Usuario usuario);
}
