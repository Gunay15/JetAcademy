package com.student.task3;

import org.springframework.stereotype.Component;

@Component
public class WorkerMapper {
    public WorkerEntity entToDto(WorkerDto dto){
        return new WorkerEntity(dto.getName(), dto.getSurname(), dto.getDepartment(),dto.getSalary(),dto.getBonus());
    }
}
