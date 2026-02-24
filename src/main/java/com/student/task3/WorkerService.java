package com.student.task3;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkerService {
    private final WorkerRepository workerRepository;

    public Page<WorkerEntity> getWorker(String name,String surname,String department,Double salary,Double bonus,
                                        int pageN,int pageS){
        Specification<WorkerEntity> workerEntitySpecification=Specification.allOf(WorkerSpecification.hasName(name),
                                WorkerSpecification.hasSurname(surname),
                                WorkerSpecification.hasDepartment(department),
                                WorkerSpecification.hasSalary(salary),
                                WorkerSpecification.hasBonus(bonus));

        PageRequest pageRequest =PageRequest.of(pageN,pageS);
        return workerRepository.findAll(workerEntitySpecification,pageRequest);
    }

}
