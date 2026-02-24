package com.student.mapper;

import com.student.dao.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmpDepMapper {
    //injections
    private final DepartmentRepository departmentRepository;


    // request
//    public EmployeeEntity empDtoToEntity(CreateEmpRequest dto){
//        DepartmentEntity dep=departmentRepository.findById(dto.getDepid().orElseThrow(id)




//    }
}
