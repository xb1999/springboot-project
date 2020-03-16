package com.example.springbootproject.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
/*课程*/
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cname;
    private float weight;//权重
    private int limitscore;//最低分限制
    @OneToMany(mappedBy = "course")
    private List<Chioce> chioces;
}
