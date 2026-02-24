//package com.student.PhoneStoreTask;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.domain.Specification;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class PhoneService {
//    private final PhoneRepository phoneRepository;
//
//    public Page<PhoneEntity> geetByPhone(String brand,String model,Double price,
//                                         int pageN,int pages){
//        Pageable p1= PageRequest.of(pageN,pages);
//        Specification<PhoneEntity> spec=Specification.allOf(
//                PhoneSpecification.hasBrand(brand),
//                hasModel(model),
//                hasPrice(price));
//        )
//
//    }
//
//
//
//
//
//
//
//
//}
