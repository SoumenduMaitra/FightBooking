package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.FlightDetails;

public interface FlightRepository extends JpaRepository<FlightDetails, Integer> {

}
