package com.student.task3;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class WorkerController {
    private final WorkerService workerService;

    @GetMapping("/get-worker")
    public Page<WorkerEntity> getWorker(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String surname,
            @RequestParam(required = false) String department,
            @RequestParam(required = false) Double salary,
            @RequestParam(required = false) Double bonus,
            @RequestParam(required = false) int pageN,
            @RequestParam(required = false) int pageS){
    return workerService.getWorker(name,surname,department,salary,bonus, pageN, pageS);
}
}
