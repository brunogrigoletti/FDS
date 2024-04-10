package br.pucrs.bruno.laitano.springboot;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ExemploController {
    private List<Livro> livros;

    public ExemploController(){
        this.livros = new ArrayList<>();
        livros.add(new Livro(123, "O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
    }

    @GetMapping("/")
    public String getMensagemInicial() {
        return "Aplicacao Spring-Boot funcionando!";
    }

    @GetMapping("/livros")
    public List<Livro> getLivros() {
        return this.livros;
    }

    @GetMapping("/titulos")
    public List<String> getTitulos() {
        List<String> titulos = new ArrayList<>();
        for (Livro l : this.livros){
            titulos.add(l.getTitulo());
        }
        return titulos;
    }

    @GetMapping("/autores")
    public List<String> getAutores() {
        List<String> autores = new ArrayList<>();
        for (Livro l : this.livros){
            autores.add(l.getAutor());
        }
        return autores;
    }
}