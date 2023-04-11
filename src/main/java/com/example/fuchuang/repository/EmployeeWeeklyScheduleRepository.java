package com.example.fuchuang.repository;


import com.example.fuchuang.entity.EmployeeWeeklySchedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeWeeklyScheduleRepository extends JpaRepository<EmployeeWeeklySchedule, Long> {
    List<EmployeeWeeklySchedule> findByWeeknum(String weeknum);
}
