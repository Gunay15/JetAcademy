package com.student.service;

import com.student.dto.PersonDto;
import com.student.mapper.PersonMapper;
import com.student.dao.repository.PersonRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;
    private final PersonMapper personMapper;
    public void addPerson(PersonDto dtos){
        var person=personMapper.personDtoToEntity(dtos);
        personRepository.save(person);
    }
}
