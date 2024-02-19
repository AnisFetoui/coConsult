package com.example.coconsult.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFacture")
    private Long idFacture; // Clé primaire
    private String designation;
    private String currency;
    private Long invoice_number;//num facture
    private Date facture_date;
    private Date due_date;
    private float total_amount;
    private float paid_amount;
    private String  payment_status; // "Outstanding", "Partially paid", "Paid"
    private String notes;
    private String milestone_description;

    @ManyToOne
    Client client;

    @OneToMany(mappedBy= "facture", fetch = FetchType.EAGER)
    private List<Paiment> paiments;

}
