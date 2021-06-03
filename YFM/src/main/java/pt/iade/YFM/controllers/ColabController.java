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
import pt.iade.YFM.models.Colab;
import pt.iade.YFM.models.repositories.ColabRepository;

@RestController
@RequestMapping(path="/api/colaboradores")
public class ColabController {
    private Logger logger = LoggerFactory.getLogger(ColabController.class);
    @Autowired
    private ColabRepository ColabRepository;
    @GetMapping(path ="", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Colab> getColaboradores() {
        logger.info("Sending all employees");
        return ColabRepository.findAll();
    }

    @GetMapping(path = "/{colabId:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Colab getColabname(@PathVariable("colabId") int colabId) {
    logger.info("Sending employee with id "+ colabId);
    Optional<Colab> _colab = ColabRepository.findById(colabId);
    if (!_colab.isPresent()) {
      try {
        throw new NotFoundException(""+colabId+"Colaborador" + "id");
    } catch (NotFoundException e){}
    }
    return _colab.get();
  }
}