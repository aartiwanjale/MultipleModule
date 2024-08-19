package com.example.Manytoone.entity;

import lombok.*;

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
public class Books {
    @Id
    @GeneratedValue
    private int Bookid;

    private String Bookname;

    private  int price;

    @ManyToMany(mappedBy = "books")
    private List<Author> authorList;

}
