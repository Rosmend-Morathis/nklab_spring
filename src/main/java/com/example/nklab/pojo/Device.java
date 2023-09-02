package com.example.nklab.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "devices")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    @Column(name = "device_id")
    public Integer device_id;

    @ManyToOne
    @JoinColumn(name = "admin_id", referencedColumnName = "user_id")
    public User admin;

    @Column(name = "device_name")
    public String device_name;

    public Device() {
    }

    public Device(Integer device_id, User admin, String device_name) {
        this.device_id = device_id;
        this.admin = admin;
        this.device_name = device_name;
    }

    public Integer getDevice_id() {
        return device_id;
    }

    public void setDevice_id(Integer device_id) {
        this.device_id = device_id;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public String getDevice_name() {
        return device_name;
    }

    public void setDevice_name(String device_name) {
        this.device_name = device_name;
    }

    @Override
    public String toString() {
        return "Device{" +
                "device_id=" + device_id +
                ", admin=" + admin +
                ", device_name='" + device_name + '\'' +
                '}';
    }
}
