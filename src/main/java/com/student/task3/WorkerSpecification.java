package com.student.task3;

import org.hibernate.jdbc.Work;
import org.springframework.data.jpa.domain.Specification;


public class WorkerSpecification {

    public static Specification<WorkerEntity> hasName(String name){
        return (r, q, cb) ->
                name==null ? null : cb.like(r.get("name"),"%" + name +"%");
    }

    public static Specification<WorkerEntity> hasSurname(String surname){
        return (r, q, cb) ->
                surname==null ? null : cb.like(r.get("surname"),"%" +surname +"%");
    }

    public static Specification<WorkerEntity> hasDepartment(String department){
        return (r, q, cb) ->
                department==null ? null : cb.like(r.get("department"),"%" + department + "%");
    }

    public static Specification<WorkerEntity> hasSalary(Double salary){
        return (r, q, cb) ->
                salary==null ? null : cb.equal(r.get("salary"), "%" + salary + "%");
    }

    public static Specification<WorkerEntity> hasBonus(Double bonus){
        return (root, query, cb) ->
                bonus==null ? null : cb.equal(root.get("bonus"), "%" + bonus + "%");
    }

}
