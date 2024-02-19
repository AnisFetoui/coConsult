package com.example.coconsult.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HistoriqueEmployee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_historique  ;

    private String periode;
    private Float note;
    private String commentaire ;

}
