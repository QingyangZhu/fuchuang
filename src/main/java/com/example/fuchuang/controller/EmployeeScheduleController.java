package com.example.fuchuang.controller;

import com.example.fuchuang.entity.EmployeeSchedule;
import com.example.fuchuang.repository.EmployeeScheduleRepository;
import com.example.fuchuang.service.EmployeeScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;


@Controller
public class EmployeeScheduleController {
    @Autowired
    private EmployeeScheduleService employeeScheduleService;

    @GetMapping("/daily-schedule")
    public String getDailySchedule(@RequestParam("date") String dateString, Model model) {
        LocalDate date = LocalDate.parse(dateString);
        List<EmployeeSchedule> scheduleList = employeeScheduleService.getDailySchedule(date);
        model.addAttribute("scheduleList", scheduleList);
        return "daily-schedule";
    }
}


