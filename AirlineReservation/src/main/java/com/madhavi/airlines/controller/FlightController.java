package com.madhavi.airlines.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.madhavi.airlines.dao.FlightDao;
import com.madhavi.airlines.entity.Flight;

@RestController
public class FlightController {
	@Autowired
	private FlightDao flightDao;
	//@Autowired
	//private FlightService flightService;
	@PostMapping("/insertFlightDetails")
	public Object insertFlightDetails(@RequestBody Flight flight) {
		return flightDao.save(flight);
	}
	
//	@PutMapping("/updateFlightDetails")
//	public Object updateFlightDetails(@RequestBody Flight flight) {
//		return flightDao.updateFlight(flight);
//		}
	
	@DeleteMapping("/deleteFlight/{flightId}")
	public String deleteFlight(@PathVariable("flightId") int flightId) {
		 flightDao.deleteById(flightId);
		 return "Flight deleted";
	}
	
	@GetMapping("/getFlightDetails/{flightName}")
	public List<Flight> getFlightDetailsByFlightName(@PathVariable("flightName") String flightName) {
		return flightDao.findByFlightName(flightName);
	}
		
	@GetMapping("/getFlightDetails/{flightDate}")
		public List<Flight> getFlightDetailsByFlightDate(@PathVariable("flightDate") Date flightDate) {
			return flightDao.findByFlightDate(flightDate);
		
	}		
	
	@GetMapping("/getAllFlightDetails")
	public List<Flight> getAllFlightDetails() {
		return flightDao.findAll();
	}
	
	
	
}
