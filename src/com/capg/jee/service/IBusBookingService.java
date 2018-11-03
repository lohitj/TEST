package com.capg.jee.service;

import java.util.List;

import com.capg.jee.dto.BusBooking;
import com.capg.jee.exception.BusBookingException;

public interface IBusBookingService 
{
	List<BusBooking> viewBusSchedule() throws BusBookingException;
	
	public int bookBus(BusBooking busBook) throws BusBookingException;
}
