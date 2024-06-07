package br.pucrs.bruno.laitano.jpa.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Editora {
    @Id
    private String nome;
    private String cidade;
    private long anoFundacao;

    public Editora(String nome, String cidade, long anoFundacao) {
        this.nome = nome;
        this.cidade = cidade;
        this.anoFundacao = anoFundacao;
    }

    public String getNome() {
        return nome;
    }
    public String getCidade() {
        return cidade;
    }
    public long getAnoFundacao() {
        return anoFundacao;
    }

    @Override
    public String toString() {
        return "Editora [nome=" + nome + ", cidade=" + cidade + ", anoFundacao=" + anoFundacao + "]";
    }
}