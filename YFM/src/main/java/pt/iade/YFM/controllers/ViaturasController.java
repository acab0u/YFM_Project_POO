package pt.iade.YFM.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javassist.NotFoundException;
import pt.iade.YFM.models.Viatura;
import pt.iade.YFM.models.repositories.ViaturaRepository;

@RestController
@RequestMapping(path="/api/viaturas")
public class ViaturasController {
    private Logger logger = LoggerFactory.getLogger(ViaturasController.class);
    @Autowired
    private ViaturaRepository ViaturaRepository;
    @GetMapping(path ="", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Viatura> getviaturas() {
        logger.info("Sending all vehicles");
        return ViaturaRepository.findAll();
    }
    @GetMapping(path = "/{viaturaId:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Viatura getViaturaName(@PathVariable("viaturaId") int viaturaId) {
        logger.info("Sending vehicle with id "+viaturaId);
        Optional<Viatura> _viatura = ViaturaRepository.findById(viaturaId);
        if (!_viatura.isPresent()) {
            try {
                throw new NotFoundException(""+viaturaId+" Viatura" + "id");
            } catch (NotFoundException e){}
            }
        return _viatura.get();
    }
    @PostMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
      public Viatura saveVehicle(@RequestBody Viatura newViatura) {
        logger.info("Saving employee with id "+ newViatura.getId() );
        Viatura viatura = ViaturaRepository.save(newViatura);
      return viatura;
    }
    @GetMapping(path = "/empresa/{empresaId}", produces= MediaType.APPLICATION_JSON_VALUE)
      public List<Viatura> getCompanyByViaturaId(@PathVariable("empresaId") Integer empresaId) {
        logger.info("Sending vehicles of company with id "+ empresaId );
        return ViaturaRepository.FindVehicleId(empresaId);
    }
}
