package br.edu.utfpr.receituario.usecase;

import br.edu.utfpr.receituario.domain.Receituario;
import br.edu.utfpr.receituario.repository.ReceituarioRepository;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class CriarReceituarioUseCase implements CriarReceituario {


    private final ReceituarioRepository receituarioRepository;

    public CriarReceituarioUseCase(ReceituarioRepository receituarioRepository) {
        this.receituarioRepository = receituarioRepository;
    }

    public Receituario criar(@Valid Receituario receituario) {
        return receituarioRepository.save(receituario);
    }
}
