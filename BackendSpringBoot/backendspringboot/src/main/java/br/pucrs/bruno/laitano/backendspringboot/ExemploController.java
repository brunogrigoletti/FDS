package br.pucrs.bruno.laitano.backendspringboot;

import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// Indica que a classe é um Controller
@RestController
// @RequestMapping("/biblioteca")
public class ExemploController {
    List<Livros> colecao = new ArrayList<>();

    // Indica um método que é Endpoint
    @GetMapping("/")
    public String getMensagemInicial() {
        return "Aplicacao Spring-Boot funcionando!";
    }

    @GetMapping("/livros")
    public List<Livros> getLivros() {
        return this.criaLista();
    }

    private List<Livros> criaLista(){
        colecao.add(new Livros(123,"O Senhor dos Anéis"," J.R.R. Tolkien",1954));
        return this.colecao;
    }
}