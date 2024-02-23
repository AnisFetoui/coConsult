package com.example.coconsult.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Recrutement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String poste;
    private String description;
    private LocalDate dateDebut;
    private LocalDate dateCloture;
    private String lieu;
    private String responsableRecrutement;
    private String statut; //si encore ouverte ou cloture
    private String criteresSelection;
    private Double budget;

    @Enumerated(EnumType.STRING)
    private TypeRecrutement typeRecrutement;
    @ManyToOne
    private Candidat candidat;

    @OneToMany(mappedBy = "recrutement")
    private List<TestRecrutement> testsRecrutement;
}

