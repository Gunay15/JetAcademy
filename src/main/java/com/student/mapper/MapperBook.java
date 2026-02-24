package com.student.mapper;

import com.student.dao.entity.EntityBook;
import com.student.dto.library.DtoBook;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MapperBook {
    private final MapperReview mapperReview;
    private final MapperCategory mapperCategory;
    public EntityBook dtoToEnt(DtoBook dto){
        return new EntityBook(dto.getTitle(), dto.getPrice(), dto.getStock());
    }

    public DtoBook entToDto(EntityBook r){
        return new DtoBook(mapperCategory.entToDto(r.getCategory()),r.getTitle(),r.getPrice(),r.getStock(),r.getReviewList().stream().map(mapperReview::entToDto).toList());
    }
}
