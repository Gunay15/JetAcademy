package com.student.service;

import com.student.dao.repository.RepositoryAuthor;
import com.student.dao.repository.RepositoryCategory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceCategory {
    private final RepositoryCategory repositoryCategory;
}
