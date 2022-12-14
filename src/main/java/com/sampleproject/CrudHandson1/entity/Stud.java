package com.sampleproject.CrudHandson1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stud_table")

public class Stud {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String dept;
    private int mobile;


}
