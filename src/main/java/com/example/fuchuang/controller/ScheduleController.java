package com.example.fuchuang.controller;

import ch.qos.logback.classic.Logger;
import com.example.fuchuang.entity.Schedule;
import com.example.fuchuang.repository.ScheduleRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class ScheduleController {
    // 定义日志记录器对象
    private static final Logger logger = (Logger) LoggerFactory.getLogger(ScheduleController.class);

    @Autowired
    private ScheduleRepository scheduleRepository;

    @GetMapping("/search")

    public Object search(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "date", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd",iso = DateTimeFormat.ISO.DATE)
                    LocalDate date,
            Model model) {
        logger.info("Start searching schedules. Name={}, date={}", name, date);

        List<Schedule> schedules;
        if (name != "" && name != null && date != null) {
            schedules = scheduleRepository.findByWnameAndWdate(name, date);
        } else if (name != "" && name != null) {
            schedules = scheduleRepository.findByWname(name);
        } else if (date != null) {
            schedules = scheduleRepository.findByWdate(date);
        } else {
            schedules = scheduleRepository.findAll();
        }
        //if (date != null) schedules = scheduleRepository.findByWdate(date);


        logger.info("Search result: {}", schedules);
        model.addAttribute("schedules", schedules);
        System.out.println(scheduleRepository.findByWdate(date));
        //System.out.println("jg:"+scheduleList);
        return "search";
    }
}



