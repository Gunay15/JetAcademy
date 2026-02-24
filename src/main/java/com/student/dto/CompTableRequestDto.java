package com.student.dto;

import com.student.Brand;
import lombok.Data;

@Data
public class CompTableRequestDto {
    private Brand brand;
    private String model;
    private Integer capacity;
    private double price;
}
