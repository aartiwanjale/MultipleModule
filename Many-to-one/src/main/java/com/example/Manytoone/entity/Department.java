package com.example.Manytoone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Department {

    @Id
    @GeneratedValue
    private int Depid;

    private String name;

    private String Decription;

    @OneToMany(mappedBy = "department")
    private List<Student123> student123;



}
