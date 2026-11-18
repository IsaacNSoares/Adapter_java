package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransacaoPDVTest {

    @Test
    void deveRetornarStatusTextoTransacao() {
        TransacaoPDV transacao = new TransacaoPDV();
        transacao.setRetorno("AUTORIZADO");

        assertEquals("AUTORIZADO", transacao.getRetorno());
    }

    @Test
    void deveRetornarCodigoNumericoTransacao() {
        TransacaoPDV transacao = new TransacaoPDV();
        transacao.setRetorno("AUTORIZADO");

        assertEquals(1.0f, transacao.getCodigoRetorno());
    }

}