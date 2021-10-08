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
@Table(name = "Flight_Details")
public class FlightDetails {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq1" )
	@SequenceGenerator(name="seq1", sequenceName = "user_sequence", allocationSize = 1, initialValue = 100)
	private Integer flightId;
	private Integer price;
	private String source;
	private String destination;
	private int seatsAvailable;
	private AirlineDetails airLineDetails;
	private Schedule schedule;
	private BookingDetails bookingDetails;
	
	
	
	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	
	public Integer getFlightId() {
		return flightId;
	}

	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getSeatsAvailable() {
		return seatsAvailable;
	}
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	public AirlineDetails getAirLineDetails() {
		return airLineDetails;
	}
	public void setAirLineDetails(AirlineDetails airLineDetails) {
		this.airLineDetails = airLineDetails;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public BookingDetails getBookingDetails() {
		return bookingDetails;
	}
	public void setBookingDetails(BookingDetails bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

} 
