package br.pucrs.bruno.laitano.jpa.persistencia;

import java.util.List;

public interface IEditoraRepository {
    List<Editora> getEditoras();
    Editora getEditoraCodigo(long codigo);
}

