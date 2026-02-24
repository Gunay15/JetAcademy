package com.student.mapper;

import com.student.dao.entity.DepEntit;
import com.student.dao.entity.EmpEntit;
import com.student.dao.repository.DepRepositori;
import com.student.dao.repository.EmpRepository;
import com.student.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class DepEmpMap {
    private EmpRepository empRepository;
    private DepRepositori depRepositori;
    //request
    public EmpEntit empEntToDto(EmpRequest dto){
        return EmpEntit.builder()
                .name(dto.getName())
                .surname(dto.getSurname())
                .salary(dto.getSalary())
                .build();
    }

    public DepEntit depEnToDto(DepRequest dto){
        return DepEntit.builder()
                .name(dto.getName())
                .build();
    }
    //response

    public EmpRespons empEnToDto(EmpEntit dto){
        return EmpRespons.builder()
                .id(dto.getId())
                .name(dto.getName())
                .surname(dto.getSurname())
                .salary(dto.getSalary())
                .build();
    }
    public List<EmpRespons> empEnToDtoList(List<EmpEntit> dto){
        return dto.stream().map(this::empEnToDto).toList();
    }
    public DepRespons deppEnToDto(DepEntit e){

        EmpRespons empRespons=new EmpRespons();

      var a=  e.getDepEmpEntityList()
              .stream()
                .map(x->new EmpRespons(x.getId(),
                        x.getEmpEntit().getName(),
                        x.getEmpEntit().getSurname(),
                        x.getEmpEntit().getSalary()))
                .toList();

        return DepRespons.builder()
                .name(e.getName())
                .empRespons(a)
                        .build();
    }
}
