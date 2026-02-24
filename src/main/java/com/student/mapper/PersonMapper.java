package com.student.mapper;

import com.student.dto.PersonDto;
import com.student.dao.entity.PersonEntity;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {
    public PersonEntity personDtoToEntity(PersonDto dto){
        return new PersonEntity(dto.getName());
    }
}
