package pt.iade.YFM.models.repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.YFM.models.Colab;

public interface ColabRepository extends CrudRepository<Colab, Integer> {
    Iterable<Colab> findByNameContaining(String text);
    
}

