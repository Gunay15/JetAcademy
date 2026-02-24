package com.student.mapper;

import com.student.dao.entity.PersonEntity;
import com.student.dao.entity.PersonnEntity;
import com.student.dto.PersonnDto;
import org.springframework.stereotype.Component;

@Component
public class PersonnMap {
    public PersonnEntity entToDto(PersonnDto dto){
        return new PersonnEntity(dto.getId(), dto.getName(), dto.getSurname(), dto.getAge());
    }
}
