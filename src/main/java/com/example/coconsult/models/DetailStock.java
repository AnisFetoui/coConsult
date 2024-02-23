package com.example.coconsult.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DetailStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="StockID")
    private Long id;




}
