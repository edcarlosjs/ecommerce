package com.techchallenge.ecommerce.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;
	private String nm_usuario;
	private String senha;
	
	@ManyToMany
	private List<Papel> papel;

	public Usuario() {

	}

	public Usuario(Long id_usuario, String nm_usuario, String senha, List<Papel> papel) {

		this.id_usuario = id_usuario;
		this.nm_usuario = nm_usuario;
		this.senha = senha;
		this.papel = papel;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNm_usuario() {
		return nm_usuario;
	}

	public void setNm_usuario(String nm_usuario) {
		this.nm_usuario = nm_usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Papel> getPapel() {
		return papel;
	}

	public void setPapel(List<Papel> papel) {
		this.papel = papel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_usuario == null) ? 0 : id_usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id_usuario == null) {
			if (other.id_usuario != null)
				return false;
		} else if (!id_usuario.equals(other.id_usuario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", nm_usuario=" + nm_usuario + ", senha=" + senha + ", papel="
				+ papel + "]";
	}
	
	
	

}
