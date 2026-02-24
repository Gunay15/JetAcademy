package com.student.dao.repository;

import com.student.dao.entity.ChildPersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildPersonRepository extends JpaRepository<ChildPersonEntity,Long> {
}
