package com.student.controller;


import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
////http://localhost:8080/get?name=Gunay
//student.com/api/v1/student/get
@Getter
@Setter
public class StudentController {

    private List<String> meyveler = new ArrayList<>();
    private Map<Integer, String> student = new HashMap<>();


    public List<String> getMeyveler() {
        return meyveler;
    }

    public void setMeyveler(List<String> meyveler) {
        this.meyveler = meyveler;
    }

    @PostMapping("/add-fruit")
    public void addFruit(String fruit) {
        if (fruit.trim().isEmpty()) {
            throw new RuntimeException("Meyve bosh ola bilmez");
        }
        meyveler.add(fruit);
    }

    @GetMapping("/get-fruit")
    public List<String> getFruits() {
        return getMeyveler();
    }

    @GetMapping("/get-by-fruit")
    public List<String> getFruitBy(String fruit) {
        return meyveler.stream().filter(u -> u.equals(fruit)).toList();
    }


    @PostMapping("/add-fruit-my")
    public String addFruitt(String fruit) {
        if (fruit.trim().isEmpty()) {
            return "meyve adi bos ola bilmez";
        }
        if (meyveler.contains(fruit)) {
            return "bu meyve listde var";
        }

        meyveler.add(fruit);

        return null;
    }

    @DeleteMapping("/delete")
    public void deleteFruit(String fruit) {
        meyveler.remove(fruit);
    }

    @PostMapping("/add-name-id")
    public void addName(Integer id,String name) {
        student.put(id,name);
    }

    @GetMapping("/search")
    public String getsearch(Integer id) {
        String name = student.get(id);

        return name == null ? "user yoxdu" : name;


    }
@DeleteMapping("/delete-name-id")
    public Map<Integer,String> deleteMap(Integer id){
        student.remove(id);
        return student;
}
//    @GetMapping("/get")
//    public List<String> helloText(Integer id){
//        return Map.of(1,"Gunay",2,"Arzu",3,"Gunel")
//                .entrySet()
//                .stream()
//                .filter(a -> a.getKey().equals(id))
//                .map(Map.Entry::getValue)
//                .toList();


}
