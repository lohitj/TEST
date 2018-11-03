package com.capg.jee.dao;

import java.util.List;

import com.capg.jee.dto.BusBooking;
import com.capg.jee.exception.BusBookingException;


public interface IBusBookingSystemDAO 
{
	List<BusBooking> viewBusSchedule() throws BusBookingException;
	
	public int bookBus(BusBooking busBook) throws BusBookingException;
}
