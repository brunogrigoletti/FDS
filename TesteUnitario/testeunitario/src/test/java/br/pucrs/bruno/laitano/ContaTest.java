package br.pucrs.bruno.laitano;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContaTest {
    private Conta conta;

    @Test
    public void deposita1000test() {
        conta = new Conta(0.0);
        conta.depositar(1000.0);
        assertEquals(1000.0, conta.getSaldo());
    }

    @Test
    public void setSaldo100test() {
        conta = new Conta();
        conta.setSaldo(100.0);
        assertEquals(100.0,conta.getSaldo());
    }

    @Test
    public void sacar50test() {
        conta = new Conta(100.0);
        conta.sacar(50.0);
        assertEquals(50.0,conta.getSaldo());
    }

    @Test
    public void transferir50test(){
        conta = new Conta(100.0);
        conta.transferir(conta, 50.0);
        assertEquals(100.0, conta.getSaldo());
    }
}