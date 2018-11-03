package com.capg.jee.service;

import java.util.List;

import com.capg.jee.dao.BusBookingDAOImpl;
import com.capg.jee.dao.IBusBookingSystemDAO;
import com.capg.jee.dto.BusBooking;
import com.capg.jee.exception.BusBookingException;

public class BusBookingServiceImpl implements IBusBookingService 
{
	IBusBookingSystemDAO busBookingDAO;
	
	public BusBookingServiceImpl() 
	{
		busBookingDAO = new BusBookingDAOImpl();
	}

	@Override
	public List<BusBooking> viewBusSchedule() throws BusBookingException 
	{
		return busBookingDAO.viewBusSchedule();
	}

	@Override
	public int bookBus(BusBooking busBook) throws BusBookingException 
	{
		return busBookingDAO.bookBus(busBook);
	}

}
