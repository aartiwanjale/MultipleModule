package com.example.Manytoone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Author {

    @Id
    @GeneratedValue

    private int A_id;

    private String A_name;

    private String A_address;

    @ManyToMany(mappedBy = "authorList")
    private List<Books> books;
}
