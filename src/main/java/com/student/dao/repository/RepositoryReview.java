package com.student.dao.repository;

import com.student.dao.entity.EntityReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryReview extends JpaRepository<EntityReview,Long> {
}
