package br.edu.utfpr.receituario.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class AtestadoTest {



    @Test
    void estaInValido() {
        Atestado atestado = new Atestado(null);
        assertFalse(atestado.estaValido());
    }

    @Test
    void estaValido() {
        Atestado atestado = new Atestado(5);
        assertFalse(atestado.estaValido());
    }
}