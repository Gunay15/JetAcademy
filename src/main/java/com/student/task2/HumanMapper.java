package com.student.task2;

import org.springframework.stereotype.Component;

@Component
public class HumanMapper {

    public HumanEntity entToDto(HumanDto dto){
        return new HumanEntity(dto.getId(),dto.getName(), dto.getAge());
    }
}
