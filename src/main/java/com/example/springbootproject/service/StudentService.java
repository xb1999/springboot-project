package com.example.springbootproject.service;

import com.example.springbootproject.entity.Student;
import com.example.springbootproject.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private ChioceRepository chioceRepository;
    @Autowired
    private DirectionRepository directionRepository;


    }

}
