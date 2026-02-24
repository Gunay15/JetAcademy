package com.student.mapper;

import com.student.dto.CompTableRequestDto;
import com.student.dto.CompTableResponseDto;
import com.student.dao.entity.CompTableEntity;
import org.springframework.stereotype.Component;

@Component
public class CompTableMapper {
    public CompTableEntity compTableDto(CompTableRequestDto dto){
        return new CompTableEntity(dto.getModel(),dto.getBrand(),dto.getCapacity(),dto.getPrice());
    }



    public CompTableResponseDto entityToDtoComp(CompTableEntity e){
        return new CompTableResponseDto(e.getBrand(),e.getModel(),e.getCapacity(),e.getPrice());
    }
}
