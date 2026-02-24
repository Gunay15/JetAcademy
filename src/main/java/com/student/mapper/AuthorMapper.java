package com.student.mapper;

import com.student.dao.entity.AuthorEntity;
import com.student.dto.AuthorResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AuthorMapper {
    private final BookMapper bookMapper;




    public AuthorResponseDto entityToResponseAuthorDto(AuthorEntity a){
        return new AuthorResponseDto(a.getName(),bookMapper.entityToResponseDtoList(a.getBooks()));
    }
    public List<AuthorResponseDto> entityToResponseAuthorDtoList(List<AuthorEntity> a){
        return a.stream().map(this::entityToResponseAuthorDto).toList();
    }

    public AuthorEntity dtoToEntity(AuthorResponseDto dto){
        return new AuthorEntity(dto.getName());
    }

}
