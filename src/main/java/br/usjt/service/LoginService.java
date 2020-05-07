package br.usjt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.Repository.UsuarioRepository;
import br.usjt.model.Usuario;

@Service
public class LoginService {
	
	@Autowired
	UsuarioRepository usuarioRepo;
	
	public boolean entrada (Usuario usuario) {
		
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
}
