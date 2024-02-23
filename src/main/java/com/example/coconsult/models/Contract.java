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
public class Contract implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idContract")
    private Long idContract; // Clé primaire
    private Date contractDate;
    private Date startDate;
    private Date endDate;
    private int version; //track contract changes
    private String currency;
    private String payment_terms;
    private String contract_status;

    @ManyToOne
    Client client;

    @OneToOne
    private DetailContract detailContract;

    @OneToMany(mappedBy= "contract", fetch = FetchType.EAGER)
    private List<Facture> factures;





}