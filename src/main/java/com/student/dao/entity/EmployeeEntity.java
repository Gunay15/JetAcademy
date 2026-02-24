package com.student.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employe")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surName;
    private Integer age;
    private double balance;

    public EmployeeEntity(String name, String surName, Integer age, double balance, DepartmentEntityyy departmentEntity) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.balance = balance;
        this.departmentEntity = departmentEntity;
    }

    @ManyToOne
    @JoinColumn(name = "dep_id")
    DepartmentEntityyy departmentEntity;
}

