package com.example.nklab.service;

import com.example.nklab.pojo.Laboratory;
import com.example.nklab.repository.LaboratoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaboratoryService {
    @Autowired
    public LaboratoryRepository laboratoryRepository;

    public LaboratoryService(LaboratoryRepository laboratoryRepository) {
        this.laboratoryRepository = laboratoryRepository;
    }

    public List<Object> findAll(){
       return laboratoryRepository.findLaboratorys();
    }

//    public Laboratory findLaboratoryByname(String name){
//        return laboratoryRepository.findLaboratoryByLab_name(name);
//    }

    public List<Object> findLaboratoryByname(String name){
        return laboratoryRepository.findLaboratoryByLab_name(name);
    }

    public Laboratory findLaboratoryById(Integer id){
        return laboratoryRepository.findLaboratoryByLab_id(id);
    }

}
