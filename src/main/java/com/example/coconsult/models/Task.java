package com.example.coconsult.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String owner;
    private Date startDate;
    private Date endDate;
    private String estimatedTime;
    private Priority priority;
    private int progression;
    private TaskStatus status;
    private String color;
    private String tags;
    private Date dueDate;
    private TypeDependance typeDependance;
    @ManyToOne
    private Task dependency;
    @OneToMany(mappedBy = "dependency")
    private List<Task> dependentTasks;
    @ManyToOne
    Project project;

}
