package com.example.fuchuang.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "employee_weekly_schedule")
public class EmployeeWeeklySchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long wid;
    public String wname;
    public String w_mon;
    public String w_tues;
    public String w_wen;
    public String w_thur;
    public String w_fri;
    public String w_sat;
    public String w_sun;
    public String weeknum;

    public String getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(String weeknum) {
        this.weeknum = weeknum;
    }

    public Long getWid() {
        return wid;
    }

    public void setWid(Long wid) {
        this.wid = wid;
    }

    public String getW_sun() {
        return w_sun;
    }

    public void setW_sun(String w_sun) {
        this.w_sun = w_sun;
    }

    public String getW_sat() {
        return w_sat;
    }

    public void setW_sat(String w_sat) {
        this.w_sat = w_sat;
    }

    public String getW_fri() {
        return w_fri;
    }

    public void setW_fri(String w_fri) {
        this.w_fri = w_fri;
    }

    public String getW_thur() {
        return w_thur;
    }

    public void setW_thur(String w_thur) {
        this.w_thur = w_thur;
    }

    public String getW_wen() {
        return w_wen;
    }

    public void setW_wen(String w_wen) {
        this.w_wen = w_wen;
    }

    public String getW_tues() {
        return w_tues;
    }

    public void setW_tues(String w_tues) {
        this.w_tues = w_tues;
    }

    public String getW_mon() {
        return w_mon;
    }

    public void setW_mon(String w_mon) {
        this.w_mon = w_mon;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }
}
