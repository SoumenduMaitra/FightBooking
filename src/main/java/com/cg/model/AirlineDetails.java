package com.cg.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "AirLine_Details")
public class AirlineDetails {
	
	
	@Id
	private Integer airLineId;
	private String airLineName;
	private BookingDetails bookingDetails;
	private FlightDetails flightDetails;
	
	
	public Integer getAirLineId() {
		return airLineId;
	}
	public void setAirLineId(Integer airLineId) {
		this.airLineId = airLineId;
	}
	public String getAirLineName() {
		return airLineName;
	}
	public void setAirLineName(String airLineName) {
		this.airLineName = airLineName;
	}
	public BookingDetails getBookingDetails() {
		return bookingDetails;
	}
	public void setBookingDetails(BookingDetails bookingDetails) {
		this.bookingDetails = bookingDetails;
	}
	public FlightDetails getFlightDetails() {
		return flightDetails;
	}
	public void setFlightDetails(FlightDetails flightDetails) {
		this.flightDetails = flightDetails;
	}
	

}
