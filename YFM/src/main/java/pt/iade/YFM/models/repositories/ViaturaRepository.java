package pt.iade.YFM.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.YFM.models.Viatura;

public interface ViaturaRepository extends CrudRepository<Viatura, Integer> {
    String QueryFindVehicleId = "SELECT viaturas.id_viatura,viaturas.id_empresa,viaturas.matricula,viaturas.data_matricula,viaturas.nome_viatura,viaturas.modelo_viatura,viaturas.nr_apolice,viaturas.data_apolice,viaturas.quilometros_viatura FROM viaturas INNER JOIN empresa ON viaturas.id_empresa = empresa.id_empresa WHERE empresa.id_empresa = :empresaId";
    @Query(value=QueryFindVehicleId,nativeQuery=true)
    List<Viatura> FindVehicleId(@Param("empresaId") int empresaId);  
}
