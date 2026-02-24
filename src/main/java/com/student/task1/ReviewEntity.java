//package com.student.task1;
//
//import jakarta.persistence.*;
//import lombok.AccessLevel;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.experimental.FieldDefaults;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Entity
//@Table(name = "review")
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@FieldDefaults(level = AccessLevel.PRIVATE)
//public class ReviewEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//    Integer rating;
//    String comment;
//
//    public ReviewEntity(Integer rating, String comment) {
//        this.rating = rating;
//        this.comment = comment;
//    }
//
//    @OneToMany(mappedBy = "book_id")
//    List<BookkEntity> bookkEntities;
//
//
//}
