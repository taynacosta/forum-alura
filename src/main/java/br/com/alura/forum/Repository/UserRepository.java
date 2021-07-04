package br.com.alura.forum.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long>{

	Optional <Usuario> findByEmail(String email);
}
