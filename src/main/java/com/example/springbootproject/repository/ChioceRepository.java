package com.example.springbootproject.repository;

import com.example.springbootproject.entity.Chioce;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChioceRepository extends BaseRepository<Chioce,Integer>{
    @Query("FROM Chioce chi")
    Optional<List<Chioce>> list();

    @Query("SELECT chi FROM Chioce chi WHERE chi.student.id=:studentId AND chi.course.id=:courseId")
    Optional<Chioce> getElectivesByStudentIdAndCourseId(@Param("studentId")int studentId, @Param("courseId")int courseId);

    @Query("SELECT chi FROM Chioce chi WHERE chi.student.id=:id")
    Optional<List<Chioce>> getElectivesStudentId(@Param("id")int id);

    @Query("SELECT chi FROM Chioce chi WHERE chi.course.id=:id")
    Optional<List<Chioce>> getElectivesCourseId(@Param("id")int id);

}
