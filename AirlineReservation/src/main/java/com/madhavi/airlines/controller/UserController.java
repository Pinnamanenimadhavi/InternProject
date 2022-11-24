package com.madhavi.airlines.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.madhavi.airlines.dao.UserDao;
import com.madhavi.airlines.entity.Flight;
import com.madhavi.airlines.entity.Users;


@RestController

public class UserController {
	@Autowired
	private UserDao userDao;
	
	@PostMapping("/userRegisterDetails")
	public Object userRegisterDetails(@RequestBody Users user) { 
		return userDao.save(user);
	}
	
	@PostMapping("/loginUserDetails")
	public Object loginUserDetails(@RequestBody Users user) {
		userDao.findByUserIdAndUserPassword(user.getUserId(), user.getUserPassword());
		return "Login Successfull";
		}
	
	@GetMapping("/viewFlights/{flightTo}")
	public List<String> viewFlights(@PathVariable("flightTo") String flightTo) {
		return userDao.findAllFlightsByFlightTo(flightTo);
	}
	
	@PutMapping("/BookTicket/{userId}")
	public String bookTicket(@PathVariable("userId") int userId) {
		userDao.bookTicketByUserId(userId);
		 return "Ticket Booked";
	}
	
	
	@DeleteMapping("/cancelTicket/{userId}")
	public String deleteUser(@PathVariable("userId") int userId) {
		userDao.deleteById(userId);
		 return "Ticket Cancelled";
	
	
	
	

	
	}
	
	}
	


