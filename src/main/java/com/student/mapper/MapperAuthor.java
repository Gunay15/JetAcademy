package com.student.mapper;

import com.student.dao.entity.EntityAuthor;
import com.student.dto.library.DtoAuthor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MapperAuthor {
    private final MapperReview mapperReview;
    private final MapperBook mapperBook;
    public EntityAuthor dtoToEnt(DtoAuthor dto) {
        return new EntityAuthor(dto.getName(), dto.getSurname(), dto.getAge());
    }

    public DtoAuthor entToDto(EntityAuthor e) {
       return new DtoAuthor(e.getName(),e.getSurname(),e.getAge(),e.getEntityReviews().stream().map(mapperReview::entToDto).toList(),e.getBookList().stream().map(mapperBook::entToDto).toList());
    }
}
