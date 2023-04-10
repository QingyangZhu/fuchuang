package com.example.fuchuang.service;

import com.example.fuchuang.entity.EmployeeSchedule;
import com.example.fuchuang.repository.EmployeeScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeScheduleService {
    @Autowired
    private EmployeeScheduleRepository employeeScheduleRepository;

    public List<EmployeeSchedule> getDailySchedule(LocalDate date) {
        return employeeScheduleRepository.findByWdateOrderByWbegintime(date);
    }
}