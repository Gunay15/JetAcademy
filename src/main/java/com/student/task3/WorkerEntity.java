package com.student.task3;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "worker")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WorkerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String surname;

    public WorkerEntity(String name, String surname, String department, Double salary, Double bonus) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.bonus = bonus;
    }

    String department;
    Double salary;
    Double bonus;


}
