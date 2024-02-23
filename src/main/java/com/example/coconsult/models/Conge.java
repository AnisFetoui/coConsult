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
public class Conge implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_conge;
    @Temporal(TemporalType.DATE)
    private Date date_debut;
    @Temporal(TemporalType.DATE)
    private Date date_fin;
    @Enumerated(EnumType.STRING)
    private CongeType typeC;
    @Enumerated(EnumType.STRING)
    private CongeStatut StatutC;
    private String commentaire;
    private String justification;

    @ManyToOne(cascade = CascadeType.ALL)
    Employee employee;


}
