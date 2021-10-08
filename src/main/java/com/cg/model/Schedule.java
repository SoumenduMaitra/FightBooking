package com.cg.model;

import java.time.LocalTime;

public class Schedule {
	
	private Integer flightId;
	private String flightName;
	private LocalTime departure;
	private LocalTime arrival;
	
	public Integer getFlightId() {
		return flightId;
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public LocalTime getDeparture() {
		return departure;
	}
	public void setDeparture(LocalTime departure) {
		this.departure = departure;
	}
	public LocalTime getArrival() {
		return arrival;
	}
	public void setArrival(LocalTime arrival) {
		this.arrival = arrival;
	}

}
