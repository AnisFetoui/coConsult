package com.example.coconsult.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paiment  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idpaiement ")
    private Long idFacture; // Clé primaire
    private Date payment_date ;
    private float amount;
    @Enumerated(EnumType.STRING)
    Typepaiment typepaiment;


    @ManyToOne
    Client client;
    @ManyToOne
    Facture facture;
}



