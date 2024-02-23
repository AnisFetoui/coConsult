package com.example.coconsult.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long task_id;
    private String task_name;
    private String task_description;
    private String owner;
    private Date startDate;
    private Date endDate;
    private String estimatedTime;
    private Priority priority;
    private int progression;
    private TaskStatus status;
    private String tags;
    private Date dueDate;
    private TypeDependance typeDependance;
    @ManyToOne
    Project project;

}
