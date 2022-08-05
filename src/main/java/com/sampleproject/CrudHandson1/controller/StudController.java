package com.sampleproject.CrudHandson1.controller;

import com.sampleproject.CrudHandson1.entity.Stud;
import com.sampleproject.CrudHandson1.repository.StudRepository;
import com.sampleproject.CrudHandson1.service.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.List;
import java.util.Map;

@RestController
public class StudController {

        @Autowired
        private RequestMappingHandlerMapping handlerMapping;
        @Autowired
        private StudService service;

        @PostMapping("/addstudent")
        public Stud addStud(@RequestBody Stud stud) {return service.saveStud(stud);}

        @PostMapping("/addstudents")
        public List<Stud> addStuds(@RequestBody List<Stud> studs) {return service.saveStuds(studs);}

        @GetMapping("/students")
        public List<Stud> findAllStuds() {return service.getStuds();}

        @GetMapping("/studentbyid/{id}")
        public Stud findStudById(@PathVariable int id) { return service.getStudById(id);}

        @GetMapping("/student/{name}")
        public List<Stud> findStudByName(@PathVariable String name) { return service.getStudByName(name);}

        @GetMapping("/studentmob/{mobile}")
        public List<Stud> findByMob(@PathVariable int mobile) {return service.getStudByMobile(mobile);}

        @PutMapping("/update")
        public Stud updateStud(@RequestBody Stud stud) {return service.updateStud(stud);}

        @DeleteMapping("/delete/{id}")
        public String deleteStud(@PathVariable int id) {return service.deleteStud(id);}

}
