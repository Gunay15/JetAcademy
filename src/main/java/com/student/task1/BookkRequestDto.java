package com.student.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookkRequestDto {
    private String title;
    private LocalDate publicationYear;
    private String author;
}
