package com.example.nklab.controller;

import com.example.nklab.service.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/main")
public class AchievementController {

    @Autowired
    AchievementService achievementService;

    @RequestMapping("/api/achievements")
    @ResponseBody
    public List<Object> getAchievements(){
        List<Object> achievements = achievementService.findAll();
        return achievements;
    }
}
