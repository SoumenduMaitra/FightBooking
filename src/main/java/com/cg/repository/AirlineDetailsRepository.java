package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.AirlineDetails;

public interface AirlineDetailsRepository extends JpaRepository<AirlineDetails, Integer> {

	
}
