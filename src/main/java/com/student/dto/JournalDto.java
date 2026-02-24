package com.student.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class JournalDto {
    @NotBlank(message = "Ad bos ola bilmez")
    String title;

    @NotBlank(message = "Yazar adi bos ola bilmez")
    String author;

    @Min(value =0)
    Double price;

    @Min(value = 0)
    Integer count;
}
