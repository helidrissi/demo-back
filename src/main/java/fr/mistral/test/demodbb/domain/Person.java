package fr.mistral.test.demodbb.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data@AllArgsConstructor@NoArgsConstructor
@Entity

public class Person {


    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

}
