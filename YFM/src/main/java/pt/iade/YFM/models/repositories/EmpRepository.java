package pt.iade.YFM.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.YFM.models.Empresa;

public interface EmpRepository extends CrudRepository<Empresa, Integer> {
    Iterable<Empresa> findByNameContaining(String text);
    
}
