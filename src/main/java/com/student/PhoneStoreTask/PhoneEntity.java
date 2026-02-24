package com.student.PhoneStoreTask;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="phone")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PhoneEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String brand;
    String model;
    String color;
    Double price;

    public PhoneEntity(String brand, String model, String color, Double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }
}
