package br.edu.utfpr.receituario.repository;

import br.edu.utfpr.receituario.domain.Doenca;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Set;

public interface DoencaRepository extends JpaRepository<Doenca, Long> {
    Set<Doenca> findAllByNomeIn(Set<String> descricoes);

    Optional<Doenca> findByNome(String descricao);
}