package pt.iade.YFM.controllers;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javassist.NotFoundException;
import pt.iade.YFM.models.Empresa;
import pt.iade.YFM.models.repositories.EmpRepository;

@RestController
@RequestMapping(path="/api/empresas")
public class EmpController {
    private Logger logger = LoggerFactory.getLogger(EmpController.class);
    @Autowired
    private EmpRepository EmpRepository;
    @GetMapping(path ="", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Empresa> getempresas() {
        logger.info("Sending all companies");
        return EmpRepository.findAll();
    }

    @GetMapping(path = "/{empId:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Empresa getEmpname(@PathVariable("empId") int empId) {
    logger.info("Sending company with id "+empId);
    Optional<Empresa> _emp = EmpRepository.findById(empId);
    if (!_emp.isPresent()) {
      try {
        throw new NotFoundException(""+empId+"Empresa" + "id");
    } catch (NotFoundException e){}
    }
    return _emp.get();
  }
    
    @GetMapping(path = "/colaborador/{colabId}", produces= MediaType.APPLICATION_JSON_VALUE)
      public Empresa getCompanyByColabId(@PathVariable("colabId") Integer colabId) {
        logger.info("Sending company of employee with id "+ colabId );
        return EmpRepository.FindCompanyId(colabId);
    }     
}