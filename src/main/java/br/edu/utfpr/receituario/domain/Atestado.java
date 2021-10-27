package br.edu.utfpr.receituario.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Atestado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer dias;

    @NotNull
    private LocalDate data;

    public Atestado(Integer dias) {
        this.dias = dias == null ? 0 : dias;
        data = LocalDate.now();
    }

    public Boolean estaValido() {
        return data.plusDays(dias).isBefore(LocalDate.now());
    }

}
