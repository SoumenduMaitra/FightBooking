package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {

}
