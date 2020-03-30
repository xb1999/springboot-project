package com.example.springbootproject.service;

import com.example.springbootproject.entity.Teacher;
import com.example.springbootproject.repository.CourseRepository;
import com.example.springbootproject.repository.DirectionChioceRepository;
import com.example.springbootproject.repository.DirectionRepository;
import com.example.springbootproject.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private DirectionRepository directionRepository;
    @Autowired
    private DirectionChioceRepository directionChioceRepository;

    /*教师注册*/
    private void register(Integer tid,String tname,String password){
        Teacher teacher = new Teacher();
        teacher.setId(tid);
        teacher.setName(tname);
        teacher.setPassword(password);
        teacherRepository.save(teacher);
    }
    /*修改学生数与范围*/
    private void updateTeacherDetail(Integer tid,Integer limit,Integer rank){
        Teacher teacher = teacherRepository.findById(tid).orElse(null);
        if (teacher != null){
            teacher.setLimit(limit);
            teacher.setRank(rank);
        }
        teacherRepository.save(teacher);
    }
}
