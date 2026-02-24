package com.student.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "review_book")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EntityReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String comment;
    float rating;

    public EntityReview(String comment, float rating) {
        this.comment = comment;
        this.rating = rating;
    }

    @ManyToOne
    EntityAuthor entityAuthor;

    @ManyToOne
    EntityBook entityBook;
}
