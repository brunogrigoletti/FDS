package br.pucrs.bruno.laitano.jpa.persistencia;

import java.util.List;

public interface IAcervoRepository {
    List<Livro> getLivros();
    Livro getLivroId(long id);
}