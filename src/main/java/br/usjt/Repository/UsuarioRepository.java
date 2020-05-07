package br.usjt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Usuario findOneByLoginAndSenha(String login, String senha);
	
}
