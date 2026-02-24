package com.student.task4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface  BuildingRepository extends JpaRepository<BuildingEntity,Long> {

    @Query(value = "select name,floor,hasLift from building left join room on building.id=room.",nativeQuery = true)

    BuildingDto findBuild();

}
