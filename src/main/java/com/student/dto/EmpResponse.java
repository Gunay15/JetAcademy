package com.student.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmpResponse {
    private Long id;
    private String name;
    private String surName;
    private Integer age;
    private double balance;

}
