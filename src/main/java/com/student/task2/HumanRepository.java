package com.student.task2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HumanRepository extends JpaRepository<HumanEntity,Long> {

    @Query(value = "select name,age from human", nativeQuery = true)
    List<HumanDto> findHuman();

    @Query(value = "select id,name,age from human where id=:id", nativeQuery = true)
    HumanDto findId(Long id);

    @Query(value = "select id,name,age from human where age=(:age)", nativeQuery = true)
    List<HumanDto> findAge(Integer age);


    @Query(value = "SELECT id, name, age FROM human WHERE name ILIKE :g%",nativeQuery = true)
    List<HumanDto> findName(@Param("g") String name);
}
