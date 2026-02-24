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
//
//@Entity
//@Table(name = "bookk")
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@FieldDefaults(level = AccessLevel.PRIVATE)
//public class BookkEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//    String title;
//    LocalDate publicationYear;
//    String author;
//
//    public BookkEntity(String title, LocalDate publicationYear, String author) {
//        this.title = title;
//        this.publicationYear = publicationYear;
//        this.author = author;
//    }
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "review.book_id")
//    ReviewEntity reviewEntity;
//
//
//}
