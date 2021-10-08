package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.BookingDetails;

public interface BookingRepository extends JpaRepository<BookingDetails, Integer> {

}
