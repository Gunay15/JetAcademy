package com.student.dao.repository;

import com.student.dao.entity.CompTableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompTableRepository extends JpaRepository<CompTableEntity,Long> {
}
