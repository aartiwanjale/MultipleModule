package com.example.Manytoone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Student123 {


    @Id
    @GeneratedValue
    private Integer s_id;

    private String F_name;

    private String L_name;

    @ManyToOne
    private Department department;
}
