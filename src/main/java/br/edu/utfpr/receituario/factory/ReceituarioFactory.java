package br.edu.utfpr.receituario.factory;

import br.edu.utfpr.receituario.domain.Atestado;
import br.edu.utfpr.receituario.domain.Doenca;
import br.edu.utfpr.receituario.domain.Paciente;
import br.edu.utfpr.receituario.domain.Receituario;

import java.util.Set;

public class ReceituarioFactory {

    public static Receituario create(Paciente paciente, Set<Doenca> doencas, Integer diasAtestado) {
        return new Receituario(doencas, paciente, new Atestado(diasAtestado));
    }
}
