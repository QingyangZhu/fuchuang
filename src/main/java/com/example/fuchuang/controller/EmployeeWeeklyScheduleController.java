package com.example.fuchuang.controller;

import com.example.fuchuang.entity.EmployeeWeeklySchedule;
import com.example.fuchuang.repository.EmployeeWeeklyScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class EmployeeWeeklyScheduleController {
    @Autowired
    private EmployeeWeeklyScheduleRepository employeeWeeklyScheduleRepository;

    @GetMapping("/week")
    public Object employeeWeeklySchedule(Model model,String weeknum) {
        List<EmployeeWeeklySchedule> employeeWeeklyScheduleList;
        if(weeknum == null) {
            employeeWeeklyScheduleList = employeeWeeklyScheduleRepository.findAll();
        }else {
            employeeWeeklyScheduleList = employeeWeeklyScheduleRepository.findByWeeknum(weeknum);
        }
        model.addAttribute("employeeWeeklyScheduleList", employeeWeeklyScheduleList);

        System.out.println(employeeWeeklyScheduleList);
        System.out.println(weeknum);
        return "week";
    }
}
