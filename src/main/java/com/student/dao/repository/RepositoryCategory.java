package com.student.dao.repository;

import com.student.dao.entity.EntityCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCategory extends JpaRepository<EntityCategory,Long> {
}
