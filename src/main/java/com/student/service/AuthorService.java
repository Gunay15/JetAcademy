package com.student.service;

import com.student.dto.AuthorResponseDto;
import com.student.dao.entity.AuthorEntity;
import com.student.mapper.AuthorMapper;
import com.student.dao.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    public List<AuthorResponseDto> getAuthors(){
        List<AuthorEntity> all=authorRepository.findAll();
        return all.stream().map(authorMapper::entityToResponseAuthorDto).toList();
    }
    public void addAuthor(AuthorResponseDto a){
        authorRepository.save(authorMapper.dtoToEntity(a));
    }


}
