package com.student.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Table(name = "book_table")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EntityBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    Double price;
    Integer stock;

    public EntityBook(String title, Double price, Integer stock) {
        this.title = title;
        this.price = price;
        this.stock = stock;
    }

    @ManyToOne
    EntityCategory category;


    @ManyToOne()
    EntityAuthor author;

    @OneToMany(mappedBy = "entityBook")
    List<EntityReview> reviewList;

}
