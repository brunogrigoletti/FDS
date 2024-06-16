package br.pucrs.bruno.laitano.jpa.persistencia;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface IAcervoJpaItfRep extends CrudRepository<Livro,Long>{
    List<Livro> findAll(); 
    Livro findById(long id); 
}




