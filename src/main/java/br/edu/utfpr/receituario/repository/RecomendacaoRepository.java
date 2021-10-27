package br.edu.utfpr.receituario.repository;

import br.edu.utfpr.receituario.domain.Recomendacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecomendacaoRepository extends JpaRepository<Recomendacao, Long> {
}