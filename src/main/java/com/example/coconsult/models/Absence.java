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
public class Absence implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_absence ;
    @Temporal(TemporalType.DATE)
    private Date date_debut;
    @Temporal(TemporalType.DATE)
    private Date date_fin;
    private int nombre_jours;

    private String motif ;
    private String justification;

}
