package com.madhavi.airlines.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class BookingSystem {
	@Id
	private String flightName;
	private  Integer numberOfSeats;
	private  Date dateTime;
	public BookingSystem(String flightName, Integer numberOfSeats, Date dateTime) {
		super();
		this.flightName = flightName;
		this.numberOfSeats = numberOfSeats;
		this.dateTime = dateTime;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	@Override
	public String toString() {
		return "BookingSystem [flightName=" + flightName + ", numberOfSeats=" + numberOfSeats + ", dateTime=" + dateTime
				+ "]";
	}
	

}
