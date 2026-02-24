package com.student.dto;

import com.student.Brand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompTableResponseDto {
    private Brand brand;
    private String model;
    private Integer capacity;
    private double price;
}

