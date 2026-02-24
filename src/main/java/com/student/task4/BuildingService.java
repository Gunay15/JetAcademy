package com.student.task4;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BuildingService {
    private final BuildingRepository buildingRepository;

    public BuildingDto findBuild(){
        return buildingRepository.findBuild();
    }
}
