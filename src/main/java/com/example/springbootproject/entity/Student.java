package com.example.springbootproject.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
/*学生*/
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne
    private Teacher teacher;
    @OneToMany(mappedBy = "student")
    private List<Chioce> chioces;
    @OneToMany(mappedBy = "student")
    private List<DirectionChioce> directionChioces;
}
