package com.student.task4;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Table(name = "building")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BuildingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Integer floor;
    Boolean hasLift;

    public BuildingEntity(String name, Integer floor, Boolean hasLift) {
        this.name = name;
        this.floor = floor;
        this.hasLift = hasLift;
    }

    @OneToMany(mappedBy ="building",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<RoomEntity> roomEntities;
}