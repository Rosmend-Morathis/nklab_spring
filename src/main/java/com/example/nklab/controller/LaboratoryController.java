package com.example.nklab.controller;

import com.example.nklab.pojo.Laboratory;
import com.example.nklab.pojo.User;
import com.example.nklab.result.Result;
import com.example.nklab.service.LaboratoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/main")
public class LaboratoryController {

    @Autowired
    LaboratoryService laboratoryService;

    @RequestMapping(value = "/api/labs")
    @ResponseBody
    public List<Object> getLabs(){
        List<Object> labs = laboratoryService.findAll();
        System.out.println(labs);
        return labs;
    }

    @RequestMapping(value = "/api/findAllLabs")
    @ResponseBody
    public List<Object> findAllLabs(){
        return laboratoryService.findAll();
    }

//    @RequestMapping(value = "/api/getLabByName")
//    @ResponseBody
//    public Laboratory getLabByName(@RequestParam String name){
//        return laboratoryService.findLaboratoryByname(name);
//    }

    @RequestMapping(value = "/api/getLabByName")
    @ResponseBody
    public List<Object> getLabByName(@RequestParam String name){
        return laboratoryService.findLaboratoryByname(name);
    }
}
