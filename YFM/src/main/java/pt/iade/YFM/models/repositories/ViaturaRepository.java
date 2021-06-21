package pt.iade.YFM.models.repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.YFM.models.Viatura;

public interface ViaturaRepository extends CrudRepository<Viatura, Integer> {
    Iterable<Viatura> findById(String text);
    Iterable<Viatura> findBycompany(String text);
}
