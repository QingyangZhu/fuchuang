package com.example.fuchuang.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "employee_schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wid;

    @Column(name = "wname")
    private String wname;

    @Column(name = "wdate")
    private LocalDate wdate;

    @Column(name = "wbegintime")
    private LocalTime wbegintime;

    @Column(name = "wendtime")
    private LocalTime wendtime;

    // getter 和 setter 方法

    public Long getWid() {
        return wid;
    }

    public void setWid(Long wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public LocalDate getWdate() {
        return wdate;
    }

    public void setWdate(LocalDate wdate) {
        this.wdate = wdate;
    }

    public LocalTime getWbegintime() {
        return wbegintime;
    }

    public void setWbegintime(LocalTime wbegintime) {
        this.wbegintime = wbegintime;
    }

    public LocalTime getWendtime() {
        return wendtime;
    }

    public void setWendtime(LocalTime wendtime) {
        this.wendtime = wendtime;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "wid=" + wid +
                ", wname='" + wname + '\'' +
                ", wdate='" + wdate + '\'' +
                ", wbegintime='" + wbegintime + '\'' +
                ", wendtime='" + wendtime + '\'' +
                '}';
    }

}

