package br.edu.utfpr.receituario.repository;

import br.edu.utfpr.receituario.domain.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}