package com.student.mapper;

import com.student.dao.entity.LaptopEntity;
import com.student.dto.LaptopDto;
import org.springframework.stereotype.Component;

@Component
public class LaptopMapper {
    public LaptopEntity dtoToEnt(LaptopDto dto){
        return new LaptopEntity(dto.getName(), dto.getColor(), dto.getPrice(), dto.getCapacity());

    }


    public LaptopDto entToDto(LaptopEntity ent){
        return new LaptopDto(ent.getName(),ent.getColor(),ent.getPrice(),ent.getCapacity());
    }

}
