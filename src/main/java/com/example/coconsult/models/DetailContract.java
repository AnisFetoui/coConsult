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
public class DetailContract implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetails")
    private Long idDetails; // Clé primaire
    private String item_description;
    private Float unit_price ;
    private Date delivery_date;
    private Date created_at;
    private Date updated_at;

    @OneToOne(mappedBy="projetDetail")
    private Contract contract;
}
