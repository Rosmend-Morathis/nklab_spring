package com.example.nklab.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "labachievements")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Achievement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achievement_id")
    public Integer achievement_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;

    @Column(name = "achievement_name")
    public  String achievement_name;

    @Column(name = "achievement_date")
    public Date achievement_date;

    public Achievement() {
    }

    public Achievement(Integer achievement_id, User user, String achievement_name, Date achievement_date) {
        this.achievement_id = achievement_id;
        this.user = user;
        this.achievement_name = achievement_name;
        this.achievement_date = achievement_date;
    }

    public Integer getAchievement_id() {
        return achievement_id;
    }

    public void setAchievement_id(Integer achievement_id) {
        this.achievement_id = achievement_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAchievement_name() {
        return achievement_name;
    }

    public void setAchievement_name(String achievement_name) {
        this.achievement_name = achievement_name;
    }

    public Date getAchievement_date() {
        return achievement_date;
    }

    public void setAchievement_date(Date achievement_date) {
        this.achievement_date = achievement_date;
    }

    @Override
    public String toString() {
        return "Achievement{" +
                "achievement_id=" + achievement_id +
                ", user=" + user +
                ", achievement_name='" + achievement_name + '\'' +
                ", achievement_date=" + achievement_date +
                '}';
    }
}
