package com.student.service;

import com.student.dao.repository.RepositoryBook;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceBook {
    private final RepositoryBook repositoryBook;

}
