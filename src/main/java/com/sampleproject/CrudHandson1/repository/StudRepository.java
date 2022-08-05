package com.sampleproject.CrudHandson1.repository;

import com.sampleproject.CrudHandson1.entity.Stud;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudRepository extends JpaRepository<Stud,Integer> {
   List<Stud> findByName(String name);

   List<Stud> findByMobile(int mobile);


}
