package com.student.dto.library;

import com.student.dao.entity.EntityReview;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DtoAuthor {
    String name;
    String surname;
    Integer age;
    List<DtoReview> review;
    List<DtoBook> dtoBooks;
}
