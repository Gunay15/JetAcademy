package com.student.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "laptop")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LaptopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String color;
    Double price;
    Integer capacity;

    public LaptopEntity(String name, String color, Double price, Integer capacity) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.capacity = capacity;
    }
}
