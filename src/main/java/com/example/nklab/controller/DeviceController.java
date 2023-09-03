package com.example.nklab.controller;

import com.example.nklab.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/main")
public class DeviceController {

    @Autowired
    DeviceService deviceService;

    @RequestMapping(value = "/api/devices")
    @ResponseBody
    public List<Object> getDevices(){
        List<Object> devices = deviceService.findAll();
        return devices;
    }
}
