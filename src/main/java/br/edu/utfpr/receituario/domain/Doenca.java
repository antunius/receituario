package br.edu.utfpr.receituario.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Doenca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String nome;

    @NotEmpty
    private String descricao;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Recomendacao> recomendacoes;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private Set<Medicamento> medicamentos;

}
