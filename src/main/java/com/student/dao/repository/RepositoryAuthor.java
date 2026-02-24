package com.student.dao.repository;

import com.student.dao.entity.EntityAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAuthor extends JpaRepository<EntityAuthor,Long> {
}
