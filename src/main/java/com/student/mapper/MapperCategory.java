package com.student.mapper;

import com.student.dao.entity.EntityCategory;
import com.student.dto.library.DtoCategory;
import org.springframework.stereotype.Component;

@Component
public class MapperCategory {
    public EntityCategory dtoToEnt(DtoCategory dto){
        return new EntityCategory(dto.getName());
    }

    public DtoCategory entToDto(EntityCategory category){
        return new DtoCategory(category.getName());
    }
}
