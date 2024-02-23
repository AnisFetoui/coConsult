package com.example.coconsult.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="StockID")
    Long StockID;
    int Quantity;
    String Location;
    Boolean ReplenishmentAlert ;
    @Temporal(TemporalType.DATE)
    Date EntryDate ;
    @Temporal(TemporalType.DATE)
    Date purchaseDate ;
    @Temporal(TemporalType.DATE)
    Date ExpirationDate ;
    String quality;
    int PourcentageDefauts ;

    @ManyToOne
    Fournisseur fournisseur;

    @ManyToOne(fetch = FetchType.LAZY)
    Resources resources;



}
