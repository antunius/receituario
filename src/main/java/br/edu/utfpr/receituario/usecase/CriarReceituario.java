package br.edu.utfpr.receituario.usecase;

import br.edu.utfpr.receituario.domain.Receituario;

import javax.validation.Valid;

public interface CriarReceituario {
    Receituario criar(@Valid Receituario receituario);
}
