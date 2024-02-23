package com.example.coconsult.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TestRecrutement  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;

    // Type de test (utilisation d'une énumération)
    @Enumerated(EnumType.STRING)
    private TypeTest typeTest;
    private Integer duree;
    private String logicielUtilise;
    private String competencesRequises;


    @ManyToOne
    private Recrutement recrutement;
}
