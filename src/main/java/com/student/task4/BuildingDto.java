package com.student.task4;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BuildingDto {
    String name;
    Integer floor;
    Boolean hasLift;
}
