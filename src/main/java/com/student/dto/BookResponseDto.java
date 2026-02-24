package com.student.dto;

import lombok.Data;

@Data
public class BookResponseDto {
    private String title;

    public BookResponseDto(String title) {
        this.title = title;
    }
}
