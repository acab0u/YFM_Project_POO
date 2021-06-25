package pt.iade.YFM.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.YFM.models.Colab;
import pt.iade.YFM.models.Empresa;

public interface ColabRepository extends CrudRepository<Colab, Integer> {
    Iterable<Empresa> findById(String text);
    String QueryFindColabByUsernameAndPassword = 
                "SELECT * FROM colaborador WHERE colaborador.username=:colab_username and colaborador.password=:colab_password";
    @Query(value=QueryFindColabByUsernameAndPassword,nativeQuery=true)
    Iterable<Colab> FindColabByUsernameAndPassword(@Param ("colab_username") String username, @Param ("colab_password") String password);
    Iterable<Colab> findByEmpresaId(Integer empresaId);
}