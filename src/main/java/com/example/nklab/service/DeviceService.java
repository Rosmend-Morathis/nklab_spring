package com.example.nklab.service;

import com.example.nklab.pojo.Device;
import com.example.nklab.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {
    @Autowired
    public DeviceRepository deviceRepository;

    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public List<Object> findAll(){
        return deviceRepository.findDevices();
    }
    public Device findDeviceById(Integer id){
        return deviceRepository.findDeviceByDevice_id(id);
    }
}
