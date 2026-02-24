package com.student.dao.entity;


import com.student.Brand;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="compTable")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CompTableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Brand brand;
    private String model;
    private Integer capacity;
    private Integer ram;
    private String cpu;  //processor
    private String gpu;  //videokart
    private double price;
    @CreationTimestamp
    LocalDateTime createdAt;
    @UpdateTimestamp
    LocalDateTime updateAt;

    public CompTableEntity(String model, Brand brand, Integer capacity, double price) {
        this.model = model;
        this.brand = brand;
        this.capacity = capacity;
        this.price = price;
    }
}
