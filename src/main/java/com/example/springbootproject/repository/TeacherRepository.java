package com.example.springbootproject.repository;

import com.example.springbootproject.entity.Teacher;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeacherRepository extends BaseRepository<Teacher,Integer>{
    @Query("FROM Teacher t")
    Optional<List<Teacher>> list();

    @Modifying
    @Query("UPDATE Teacher t SET t.quantity=:quantity WHERE t.id=:id")
    int updateQuantity(@Param("quantity")int quantity,@Param("id") int id);

    @Modifying
    @Query("UPDATE Teacher t SET t.ranges=:ranges WHERE t.id=:id")
    int updateRanges(@Param("ranges")int ranges, @Param("id") int id);

    Optional<Teacher> findById(int id);

    void deleteById(int id);
}
