package com.student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmpRequest {
  private String name;
  private String surname;
  private  Double salary;

}
