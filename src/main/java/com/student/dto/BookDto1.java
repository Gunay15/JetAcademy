package com.student.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto1 {
    private Long id;
    private String title;
    private String author;
    private Integer stockCount;
    private Double price;
    private LocalDate releaseDate;
    private String ownerType;
}
