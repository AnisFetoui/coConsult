package com.example.coconsult.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Consultant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String skills;
    private boolean availability;
    @OneToMany(mappedBy = "consultant")
   List<Project> projects;
}
