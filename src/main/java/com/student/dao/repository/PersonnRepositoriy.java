package com.student.dao.repository;

import com.student.dao.entity.PersonnEntity;
import com.student.dto.PersDto;
import com.student.dto.PersonnDto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonnRepositoriy extends JpaRepository<PersonnEntity,Long> {

    @Query(value = "SELECT name,surname,age from persons",nativeQuery = true)
    List<PersonnDto> findAlls();

    @Query(value = "select id,name,surname,age from persons where id = :id", nativeQuery = true)
    PersonnDto findByIds(Long id);


    @Query(value ="select id,name,age from persons where name=:name and age=:age",nativeQuery = true)
    List<PersonnDto> findNameAge(String name, Integer age);


    @Transactional
    @Modifying
    @Query(value = "update persons set name=:name where age<:age",nativeQuery = true)
    void update(String name,Integer age);

    @Transactional
    @Modifying
    @Query(value = "delete from persons where age<:age",nativeQuery = true)
    void delete(Integer age);

    @Query(value = "select count(*) from persons",nativeQuery = true)
    Long say();

    @Query(value = "select age,count(age) from persons group by age",nativeQuery = true)
    List<PersDto> group();

}
