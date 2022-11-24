package com.madhavi.airlines.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madhavi.airlines.entity.Users;

public interface UserDao extends JpaRepository<Users, Integer>{
	public Optional <String>findByUserIdAndUserPassword(int userId, String userName);
public List<String>findAllFlightsByFlightTo(String flightTo);
public Optional<String>bookTicketByUserId(int userId);

}
