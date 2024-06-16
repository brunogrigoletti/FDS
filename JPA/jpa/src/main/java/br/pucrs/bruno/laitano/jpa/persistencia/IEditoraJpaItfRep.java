package br.pucrs.bruno.laitano.jpa.persistencia;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface IEditoraJpaItfRep extends CrudRepository<Editora,Long>{
    List<Editora> findAll(); 
    Editora findById(long codigo); 
}