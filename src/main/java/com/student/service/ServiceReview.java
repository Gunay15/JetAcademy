package com.student.service;

import com.student.dao.repository.RepositoryReview;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceReview {
    private final RepositoryReview repositoryReview;
}
