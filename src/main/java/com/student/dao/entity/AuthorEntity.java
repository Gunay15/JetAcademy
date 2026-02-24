package com.student.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name ="author")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public AuthorEntity(String name) {
        this.name = name;
    }
    @OneToMany(mappedBy = "authorEntity")
    List<BookEntity> books;

}
