package com.cg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	
	@OneToOne
	@JoinColumn(name = "userIdfk", referencedColumnName = "userId")
	private User user;
	
	@ManyToOne
	@JoinColumn(name= "bookingId")
	private Schedule schedule;

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
}
