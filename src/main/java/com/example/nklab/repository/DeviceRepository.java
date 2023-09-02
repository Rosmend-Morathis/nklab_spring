package com.example.nklab.repository;

import com.example.nklab.pojo.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {

    @Query("SELECT d FROM Device d WHERE d.device_id = :device_id")
    Device findDeviceByDevice_id(@Param("device_id") Integer id);
}
