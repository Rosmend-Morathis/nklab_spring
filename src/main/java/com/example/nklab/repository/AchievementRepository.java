package com.example.nklab.repository;

import com.example.nklab.pojo.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AchievementRepository extends JpaRepository<Achievement, Integer> {

    @Query("SELECT a.achievement_id,a.user.user_id, a.achievement_name, a.achievement_date FROM Achievement a")
    List<Object> findAchievements();
}
