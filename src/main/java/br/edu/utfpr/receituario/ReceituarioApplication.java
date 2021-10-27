package br.edu.utfpr.receituario;

import br.edu.utfpr.receituario.domain.Doenca;
import br.edu.utfpr.receituario.domain.Paciente;
import br.edu.utfpr.receituario.domain.Recomendacao;
import br.edu.utfpr.receituario.factory.ReceituarioFactory;
import br.edu.utfpr.receituario.repository.DoencaRepository;
import br.edu.utfpr.receituario.repository.PacienteRepository;
import br.edu.utfpr.receituario.usecase.BuscarDoencaUseCase;
import br.edu.utfpr.receituario.usecase.CriarReceituario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.Set;

@SpringBootApplication
public class ReceituarioApplication {

    @Autowired
    private CriarReceituario criarReceituario;

    @Autowired
    private BuscarDoencaUseCase buscarDoencaUseCase;

    @Autowired
    private DoencaRepository doencaRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    public static void main(String[] args) {
        SpringApplication.run(ReceituarioApplication.class, args);
    }

    @PostConstruct
    public void executer() {
        doencaRepository.save(new Doenca(null, "covid", "sars-cov", Set.of(new Recomendacao(null, "isolamento")), Collections.emptySet()));
        var doencas = buscarDoencaUseCase.buscar(Set.of("covid"));
        Paciente paciente = new Paciente(1L, "Marcus Antunius", "02209159202");
        pacienteRepository.save(paciente);
        criarReceituario.criar(ReceituarioFactory.create(paciente, doencas, 5));
    }


}
