package com.student.mapper;

import com.student.dao.entity.StudentEntity;
import com.student.dto.StudentDto;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    public StudentEntity dtoToEnt(StudentDto dto){
        return new StudentEntity(dto.getName(), dto.getSurname(), dto.getAge(), dto.getTeacherId());
    }
}
