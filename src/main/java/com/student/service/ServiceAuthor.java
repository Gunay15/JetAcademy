package com.student.service;

import com.student.dao.repository.RepositoryAuthor;
import com.student.dto.library.DtoAuthor;
import com.student.mapper.MapperAuthor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceAuthor {
    private final RepositoryAuthor repositoryAuthor;
    private final MapperAuthor mapperAuthor;


    public List<DtoAuthor> getAuthors(){
        return repositoryAuthor.findAll().stream().map(mapperAuthor::entToDto).toList();
    }
}
