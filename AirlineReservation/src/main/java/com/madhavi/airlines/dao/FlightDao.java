package com.madhavi.airlines.dao;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madhavi.airlines.entity.Flight;

public interface FlightDao extends JpaRepository<Flight,Integer>{
	//public Flight updateFlight(Flight flight);
	public Optional<Flight> findByFlightId(int  flightId);	
	public List<Flight> findByFlightName(String flightName);
	public List<Flight> findByFlightDate(Date flightDate);
	
	
	
	
	
	
	
	

}
