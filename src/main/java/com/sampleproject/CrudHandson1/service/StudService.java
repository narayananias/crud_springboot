package com.sampleproject.CrudHandson1.service;


import com.sampleproject.CrudHandson1.entity.Stud;
import com.sampleproject.CrudHandson1.repository.StudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudService {

    @Autowired
    private StudRepository repository;

    public Stud saveStud(Stud stud) {
        return repository.save(stud);
    }

    public List<Stud> saveStuds(List<Stud> studs) {
        return repository.saveAll(studs);
    }

    public List<Stud> getStuds() {
        return repository.findAll();
    }

    public Stud getStudById(int id) {
        return repository.findById(id).orElse(null);
    }

    public List<Stud> getStudByName(String name) {
        return repository.findByName(name);
    }

    public List<Stud> getStudByMobile(int mobile) {
        return repository.findByMobile(mobile);
    }


    public String deleteStud(int id) {
        repository.deleteById(id);
        return "Student " + id + " deleted successfully!!";
    }

    public Stud updateStud(Stud stud) {
        Stud existingStud = repository.findById(stud.getId()).orElse(null);
        existingStud.setName(stud.getName());
        existingStud.setDept(stud.getDept());
        existingStud.setMobile(stud.getMobile());
        return repository.save(existingStud);


    }


}
