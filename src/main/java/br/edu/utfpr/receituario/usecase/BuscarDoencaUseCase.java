package br.edu.utfpr.receituario.usecase;

import br.edu.utfpr.receituario.domain.Doenca;
import br.edu.utfpr.receituario.repository.DoencaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class BuscarDoencaUseCase {

    private final DoencaRepository doencaRepository;

    public BuscarDoencaUseCase(DoencaRepository doencaRepository) {
        this.doencaRepository = doencaRepository;
    }

    /* Essas buscas poderiam ser melhor se fosse com querydsl, passar um objeto de filtro do front ,
    filtrando pelo nome e pela descrição da doença*/

    public Optional<Doenca> buscar(String nome) {
        return doencaRepository.findByNome(nome);
    }

    public Set<Doenca> buscar(Set<String> doencas) {
        return doencaRepository.findAllByNomeIn(doencas);
    }

}
