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
public class Reclamation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ReclamationID")
    Long ReclamationID;
    Long employeID ;
    @Temporal(TemporalType.DATE)
    Date ReclamationDate ;
    String Categorie ;
    String Departement;
    String Description;
    String priorité ;
    @Enumerated(EnumType.STRING)
    ReclamationStatus StatusReclamation ;

//    @ManyToOne
//    private User user;


}
