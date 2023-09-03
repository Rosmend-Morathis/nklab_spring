package com.example.nklab.repository;

import com.example.nklab.pojo.Laboratory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaboratoryRepository extends JpaRepository<Laboratory, Integer> {

    @Query("SELECT l FROM Laboratory l WHERE l.lab_id = :lab_id")
    Laboratory findLaboratoryByLab_id(@Param("lab_id") Integer id);

//    @Query("SELECT l FROM Laboratory l WHERE l.lab_name = :lab_name")
//    Laboratory findLaboratoryByLab_name(@Param("lab_name") String name);

    @Query("SELECT l.lab_id, l.lab_name, l.head.user_id  FROM Laboratory l ")
    List<Object> findLaboratorys();

    @Query("SELECT l.lab_id, l.lab_name, l.head.user_id FROM Laboratory l WHERE l.lab_name = :lab_name")
    List<Object> findLaboratoryByLab_name(@Param("lab_name") String name);
}
