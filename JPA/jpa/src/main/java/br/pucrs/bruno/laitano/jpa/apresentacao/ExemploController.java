package br.pucrs.bruno.laitano.jpa.apresentacao;

import br.pucrs.bruno.laitano.jpa.persistencia.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/biblioteca")
public class ExemploController {
    private IAcervoRepository acervo;
    private IEditoraRepository editoras;

    @Autowired
    public ExemploController(IAcervoRepository acervo, IEditoraRepository editoras) {
        this.acervo = acervo;        
        this.editoras = editoras;
    }

    @GetMapping("")
    public String getMensagemInicial() {
        return "Aplicacao Spring-Boot funcionando!";
    }

    @GetMapping("/livros")
    public List<Livro> getLivros() {
        return acervo.getLivros();
    }

    @GetMapping("/livroid/{id}")
    public Livro getLivroTitulo(@PathVariable("id") long id) {
        return acervo.getLivroId(id);
    }

    @GetMapping("/editoras")
    public List<Editora> getEditoras() {
        return editoras.getEditoras();
    }

    @GetMapping("/editoracod/{cod}")
    public Editora getEditoraCodigo(@PathVariable("cod") long codigo) {
        return editoras.getEditoraCodigo(codigo);
    }
}