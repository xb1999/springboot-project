package com.example.springbootproject.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
/*导师*/
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String password;
    private int limit;//学生选择上限
    private int rank;//选择排名范围
    @OneToMany(mappedBy = "teacher")
    private List<Student> students;//已选学生
}
