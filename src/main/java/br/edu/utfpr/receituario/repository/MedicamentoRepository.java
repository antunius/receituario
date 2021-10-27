package br.edu.utfpr.receituario.repository;

import br.edu.utfpr.receituario.domain.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
}