package com.student.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class EmpRespons {
    Long id;
    String name;
    String surname;
    Double salary;
}
