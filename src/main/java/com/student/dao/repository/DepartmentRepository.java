package com.student.dao.repository;

import com.student.dao.entity.DepartmentEntityyy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntityyy,Long> {
}
