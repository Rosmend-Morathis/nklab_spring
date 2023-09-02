package com.example.nklab.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "laboratories")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class Laboratory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lab_id")
    public Integer lab_id;

    @Column(name = "lab_name")
    public String lab_name;

    @ManyToOne
    @JoinColumn(name = "lab_head_id", referencedColumnName = "user_id")
    public User head;

    public Laboratory() {
    }

    public Laboratory(Integer lab_id, String lab_name, User head) {
        this.lab_id = lab_id;
        this.lab_name = lab_name;
        this.head = head;
    }

    public Integer getLab_id() {
        return lab_id;
    }

    public void setLab_id(Integer lab_id) {
        this.lab_id = lab_id;
    }

    public String getLab_name() {
        return lab_name;
    }

    public void setLab_name(String lab_name) {
        this.lab_name = lab_name;
    }

    public User getHead() {
        return head;
    }

    public void setHead(User head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Laboratory{" +
                "lab_id=" + lab_id +
                ", lab_name='" + lab_name + '\'' +
                ", head=" + head +
                '}';
    }
}
