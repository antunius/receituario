package br.edu.utfpr.receituario.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Receituario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "receituario_id"),
            inverseJoinColumns = @JoinColumn(name = "doenca_id"))
    private Set<Doenca> doencas = new HashSet<>();

    @ManyToOne
    private Paciente paciente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "atestado_id", referencedColumnName = "id")
    private Atestado atestado;

    public Receituario(Set<Doenca> doencas, Paciente paciente, Atestado atestado) {
        this.doencas = doencas;
        this.paciente = paciente;
        this.atestado = atestado;
    }

}
