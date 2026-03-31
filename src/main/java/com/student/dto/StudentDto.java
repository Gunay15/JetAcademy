package com.student.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentDto {
    String name;
    String surname;
    Integer age;
    Integer teacherId;

}
