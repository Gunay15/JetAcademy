package com.student.dao.repository;

import com.student.dao.entity.DepEntit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepRepositori extends JpaRepository<DepEntit,Long> {
}
