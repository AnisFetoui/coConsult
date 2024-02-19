package com.example.coconsult.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_employe ;
    @Temporal(TemporalType.DATE)
    private Date date_embauche ;
    @Enumerated(EnumType.STRING)
    private PosteEmployee PosteEmployee;
    private Float salaire_base ;
    private String justification;

}
