package com.example.fuchuang.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "employee_schedule")
public class EmployeeSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long wid;

    public String wname;

    public LocalTime wbegintime;

    public LocalTime wendtime;

    public LocalDate wdate;

    public Long getWid() {
        return wid;
    }

    public void setWid(Long wid) {
        wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        wname = wname;
    }

    public LocalTime getWbegintime() {
        return wbegintime;
    }

    public void setWbegintime(LocalTime wbegintime) {
        wbegintime = wbegintime;
    }

    public LocalDate getWdate() {
        return wdate;
    }

    public void setWdate(LocalDate wdate) {
        wdate = wdate;
    }

    public LocalTime getWendtime() {
        return wendtime;
    }

    public void setWendtime(LocalTime wendtime) {
        wendtime = wendtime;
    }
}
