package com.student.mapper;

import com.student.dao.entity.EntityReview;
import com.student.dto.library.DtoReview;
import org.springframework.stereotype.Component;

@Component
public class MapperReview {
    public EntityReview dtoToEnt(DtoReview dto){
        return new EntityReview(dto.getComment(), dto.getRating());
    }

    public DtoReview entToDto(EntityReview review){
        return new DtoReview(review.getComment(),review.getRating());
    }
}
