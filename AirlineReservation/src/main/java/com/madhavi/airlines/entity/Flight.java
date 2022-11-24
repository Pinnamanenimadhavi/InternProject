
package com.madhavi.airlines.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightId;
	private String flightName;
	private Date flightDate;
	private String flightStartFrom;
	private String flightTo;
	private Date flightTime;
	private int flightbookingId;
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public Date getFlightdate() {
		return flightDate;
	}
	public void setFlightdate(Date flightdate) {
		this.flightDate = flightdate;
	}
	public String getFlightStartFrom() {
		return flightStartFrom;
	}
	public void setFlightStartFrom(String flightStartFrom) {
		this.flightStartFrom = flightStartFrom;
	}
	public String getFlightTo() {
		return flightTo;
	}
	public void setFlightTo(String flightTo) {
		this.flightTo = flightTo;
	}
	public Date getFlightTime() {
		return flightTime;
	}
	public void setFlightTime(Date flightTime) {
		this.flightTime = flightTime;
	}
	public int getFlightbookingId() {
		return flightbookingId;
	}
	public void setFlightbookingId(int flightbookingId) {
		this.flightbookingId = flightbookingId;
	}
	public Flight(int flightId, String flightName, Date flightDate, String flightStartFrom, String flightTo,
			Date flightTime, int flightbookingId) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.flightDate = flightDate;
		this.flightStartFrom = flightStartFrom;
		this.flightTo = flightTo;
		this.flightTime = flightTime;
		this.flightbookingId = flightbookingId;
	}
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", flightDate=" + flightDate
				+ ", flightStartFrom=" + flightStartFrom + ", flightTo=" + flightTo + ", flightTime=" + flightTime
				+ ", flightbookingId=" + flightbookingId + "]";
	}
	

}
