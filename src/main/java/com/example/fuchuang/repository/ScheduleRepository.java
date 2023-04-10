package com.example.fuchuang.repository;

import com.example.fuchuang.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    List<Schedule> findAll();

    List<Schedule> findByWname(String wname);

    List<Schedule> findByWdate(LocalDate wdate);

    List<Schedule> findByWnameAndWdate(String wname, LocalDate wdate);
}
