package com.example.springbootproject.repository;

import com.example.springbootproject.entity.Student;
import com.example.springbootproject.entity.Teacher;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends BaseRepository<Student,Integer>{
    @Query("SELECT stu FROM Student stu")
    Optional<List<Student>> list();

    Optional<Student> findById (int  id);

    @Query("SELECT s FROM Student  s WHERE s.teacher.id=:id")
    Optional<List<Student>> getStudentsByTeacherId (@Param("id")int id);

    @Query("SELECT s FROM Student  s WHERE s.user.number=:number")
    Optional<Student> getStudentsByUserNumber (@Param("number")int number);

    @Modifying
    @Query("UPDATE Student s SET s.teacher=:teacher WHERE s.id=:id")
    int updateTeacher(@Param("teacher") Teacher teacher, @Param("id") int id);

    void deleteById(int id);

}
