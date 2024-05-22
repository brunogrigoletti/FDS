package br.pucrs.bruno.laitano;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContaCorrenteTest {
    private ContaCorrente conta;

    @Test
    public void deposita50k() {
        conta = new ContaCorrente("1", "Bruno");
        conta.deposito(50000);
        assertEquals(50000, conta.getSaldo());
        assertEquals("gold", conta.getCategoria());
    }

    @Test
    public void deposita200k() {
        conta = new ContaCorrente("1", "Bruno");
        conta.deposito(200000);
        assertEquals(200000, conta.getSaldo());
        assertEquals("platinum", conta.getCategoria());
    }
}