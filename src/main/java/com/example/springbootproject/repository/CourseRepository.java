package com.example.springbootproject.repository;

import com.example.springbootproject.entity.Course;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends BaseRepository<Course,Integer>{
    @Query("FROM Course c")
    Optional<List<Course>> list();

    @Query("SELECT c FROM Course c WHERE c.tutor.id=:id")
    Optional<List<Course>> getCourseByTutor(@Param("id")int id);

    @Query("SELECT c FROM Course c WHERE c.name=:name AND c.tutor.id=:id")
    Optional<Course> getCourseByNameAndTutorId(@Param("name")String name,@Param("id")int id);

    @Modifying
    @Query("UPDATE Course c SET c.lowestMark=:lowestMark WHERE c.id=:id")
    int updateLowestMark(@Param("lowestMark") float lowestMark,@Param("id")int id);

    @Modifying
    @Query("UPDATE Course c SET c.weight=:weight WHERE c.id=:id")
    int updateWeight(@Param("weight")float weight, @Param("id")int id);

    void deleteById(int id);

    Optional<Course> findByName(String name);
}
