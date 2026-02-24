package com.student.dto;

import lombok.Data;

@Data
public class CreateEmpRequest {
    private String name;
    private String surName;
    private Integer age;
    private double balance;
    private Long depid;
}
