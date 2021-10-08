package com.cg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "Booking_Details")
public class BookingDetails {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq1" )
	@SequenceGenerator(name="seq1", sequenceName = "user_sequence", allocationSize = 1, initialValue = 500)
	private Integer ticketId;
	private  FlightDetails flightDetails;
	private Schedule schedule;
	private AirlineDetails airLineDetails;
	
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public FlightDetails getFlightDetails() {
		return flightDetails;
	}
	public void setFlightDetails(FlightDetails flightDetails) {
		this.flightDetails = flightDetails;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public AirlineDetails getAirLineDetails() {
		return airLineDetails;
	}
	public void setAirLineDetails(AirlineDetails airLineDetails) {
		this.airLineDetails = airLineDetails;
	}
	
	

}
