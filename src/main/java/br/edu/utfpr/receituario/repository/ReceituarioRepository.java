package br.edu.utfpr.receituario.repository;

import br.edu.utfpr.receituario.domain.Receituario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceituarioRepository extends JpaRepository<Receituario, Long> {
}