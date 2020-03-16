package com.example.springbootproject.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
/*选课类*/
public class Chioce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String detail;
    private int score;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;
}
