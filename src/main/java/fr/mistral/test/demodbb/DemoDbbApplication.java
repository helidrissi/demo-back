package fr.mistral.test.demodbb;

import fr.mistral.test.demodbb.domain.Person;
import fr.mistral.test.demodbb.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoDbbApplication implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;


    public static void main(String[] args) {
        SpringApplication.run(DemoDbbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

       Person p1=new Person(null,"ilyes","Ibrahim");
       Person p2=new Person(null,"hamdi","Bouasker");



       List list=Arrays.asList(p1,p2);
       personRepository.saveAll(list);



    }
}
