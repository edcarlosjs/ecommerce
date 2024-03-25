package com.techchallenge.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techchallenge.ecommerce.entities.Usuario;
import com.techchallenge.ecommerce.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Autowired
	IUsuarioRepository usuarioRepository;
	
	
	@Override
	@Transactional
	public Usuario create(Usuario usu) {
		Usuario user = usuarioRepository.findByUsername(usu.getNm_usuario());
		if(user != null) {
			throw new Error("Usuário já existe");
		}
		usu.setSenha(passwordEncoder().encode(usu.getSenha()));
				Usuario criando = usuarioRepository.save(usu);
				return criando;
	}

}
