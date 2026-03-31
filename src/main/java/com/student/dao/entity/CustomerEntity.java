package com.student.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "customer")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String surname;
    Integer age;
    Double balance;
    String cardNumber;

    public CustomerEntity(String name, String surname, Double balance) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }
}
