package pt.iade.YFM.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.YFM.models.Empresa;

public interface EmpRepository extends CrudRepository<Empresa, Integer> {
    Iterable<Empresa> findByNameContaining(String text);
    String QueryFindCompanyId = "SELECT empresa.id_empresa, nome_empresa, empresa.e_mail , empresa.contacto,  empresa.morada, empresa.localidade, empresa.nif FROM empresa INNER JOIN colaborador ON empresa.id_empresa = colaborador.id_empresa WHERE colaborador.id_colaborador = :colabId";
    @Query(value=QueryFindCompanyId,nativeQuery=true)
    Empresa FindCompanyId(@Param("colabId") int colabId);  
}
