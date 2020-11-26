package fr.mistral.test.demodbb.web;


import fr.mistral.test.demodbb.domain.Person;
import fr.mistral.test.demodbb.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin("http://localhost:4200")
@RestController
public class Controller {
    @Autowired
    private PersonRepository personRepository;


    @GetMapping(value = "/person")
    public List<Person> listPerson(){
        List<Person> listP=personRepository.findAll();
        return  listP;
    }
}
