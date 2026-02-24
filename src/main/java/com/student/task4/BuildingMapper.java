package com.student.task4;

import org.springframework.stereotype.Component;

@Component
public class BuildingMapper {
    public BuildingEntity entToDto(BuildingDto dto){
        return new BuildingEntity(dto.getName(),dto.getFloor(),dto.getHasLift());
    }
}
