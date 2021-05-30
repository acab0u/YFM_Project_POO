package pt.iade.YFM.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.YFM.models.colab;
import pt.iade.YFM.models.repositories.ColabRepository;

@RestController
@RequestMapping(path="/api/colaboradores")
public class ColabController {
    private Logger logger = LoggerFactory.getLogger(ColabController.class);
    @Autowired
    private ColabRepository ColabRepository;
    @GetMapping(path ="", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<colab> getColaboradores() {
        logger.info("Sending all employees");
        return ColabRepository.findAll();
    }
}











// @RestController
// @RequestMapping(path="/api/greeter")
// public class ColabController {
//     private Logger logger = LoggerFactory.getLogger(ColabController.class);
//     @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
//     public String getGreeting() {
//         logger.info("Saying user to do Login");
//         return "Hello World";
//     }
//     @GetMapping(path = "{nome_colab}", produces= MediaType.APPLICATION_JSON_VALUE)
//     public String getnamecolab(@PathVariable("nome_colab") String nome_colab) {
//         logger.info("Logged in to " + nome_colab);
//         return "Hello " + nome_colab;
//     }


