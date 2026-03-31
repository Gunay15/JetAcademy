package com.student.service;

import com.student.dao.repository.StudentRepository;
import com.student.dto.StudentDto;
import com.student.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repository;
    private final StudentMapper mapper;

    public StudentDto addStudent(StudentDto dto){
        return mapper.dtoToEnt(repository.save(mapper.dtoToEnt(dto)));
    }
}
