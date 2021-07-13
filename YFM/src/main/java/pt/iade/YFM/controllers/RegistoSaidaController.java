package pt.iade.YFM.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.YFM.models.R_Saida;
import pt.iade.YFM.models.repositories.RegistoSaidaRepository;

@RestController
@RequestMapping(path="/api/registo_saidas")
public class RegistoSaidaController {
    private Logger logger = LoggerFactory.getLogger(RegistoSaidaController.class);
    @Autowired
    private RegistoSaidaRepository RegistoSaidaRepository;
    @GetMapping(path ="", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<R_Saida> getRegistoSaidas() {
        logger.info("sending out logs");
    return RegistoSaidaRepository.findAll();
    }
    @PostMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
      public R_Saida saveRegistoSaida(@RequestBody R_Saida newR_Saida) {
        R_Saida R_Saida = RegistoSaidaRepository.save(newR_Saida);
        logger.info("Saving out log with id "+ newR_Saida.getId() );
      return R_Saida ;
    }
}

