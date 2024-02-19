package com.example.coconsult.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DetailRecrutement  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateEntretien;
    private String evaluateur;
    private String commentairesEvaluateur;
    @Enumerated(EnumType.STRING)
    private StatutEntretien statutEntretien;


    private LocalDateTime datePropositionOffre;
    private LocalDateTime dateReponseCandidat;

    @Enumerated(EnumType.STRING)
    private StatutOffre statutOffre;

    @ManyToOne
    private Candidat candidat;

}
