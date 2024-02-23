package com.example.coconsult.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Fournisseur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="FournisseurID")
    Long FournisseurID;
    String Nom;
    String Address;
    Long Contact ;
    @Enumerated(EnumType.STRING)
    TypeFournisseur TypeFournisseur ;
    float score ;

    @OneToMany(mappedBy = "fournisseur")
    List<Stock> stocks;

}
