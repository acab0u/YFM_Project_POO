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
import pt.iade.YFM.models.R_Entrada;
import pt.iade.YFM.models.repositories.RegistoEntradaRepository;

@RestController
@RequestMapping(path="/api/registo_entradas")
public class RegistoEntradaController {
    private Logger logger = LoggerFactory.getLogger(RegistoEntradaController.class);
    @Autowired
    private RegistoEntradaRepository RegistoEntradaRepository;
    @GetMapping(path ="", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<R_Entrada> getRegistoEntradas() {
        logger.info("sending in logs");
    return RegistoEntradaRepository.findAll();
    }
    @PostMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
      public R_Entrada saveRegistoSaida(@RequestBody R_Entrada newR_Entrada) {
        R_Entrada R_Entrada = RegistoEntradaRepository.save(newR_Entrada);
        logger.info("Saving out log with id "+ newR_Entrada.getId() );
      return R_Entrada;
    }
}