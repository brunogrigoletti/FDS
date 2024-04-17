package br.pucrs.bruno.laitano.repository;

import java.util.*;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;

@Repository
public class AcervoRepoMemoriaImpl implements IAcervoRepository {
    private List<Livro> livros;

    public AcervoRepoMemoriaImpl() {
        livros = new ArrayList<>();
        livros.add(new Livro(110, "Aprendendo Java", "Maria da Silva", 2015));
        livros.add(new Livro(120, "Spring-Boot", "Jose de Souza", 2020));
        livros.add(new Livro(130, "Principios SOLID", "Pedro da Silva", 2023));
        livros.add(new Livro(140, "Padroes de Projeto", "JoanaMoura", 2023));
        livros.add(new Livro(150, "Teste Unitario", "Pedro da Silva", 2024));
    }

    @Override
    public List<Livro> getLivros() {
        return livros;
    }

    @Override
    public boolean removeLivro(int id) {
        List<Livro> tmp = livros.stream()
                .filter(livro -> livro.getId() == id)
                .toList();
        return tmp.removeAll(tmp);
    }

    @Override
    public List<String> getTitulos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTitulos'");
    }

    @Override
    public List<String> getAutores() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAutores'");
    }

    @Override
    public List<Livro> getLivrosDoAutor(String autor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLivrosDoAutor'");
    }

    @Override
    public List<Livro> getLivrosDoAutor(String autor, int ano) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLivrosDoAutor'");
    }

    @Override
    public Livro getLivroTitulo(String titulo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLivroTitulo'");
    }

    @Override
    public ResponseEntity<Livro> getLivroTituloResp(String titulo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLivroTituloResp'");
    }

    @Override
    public boolean cadastraLivroNovo(Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastraLivroNovo'");
    }
}