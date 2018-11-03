package com.capg.jee.dao;

public interface IBusBookingDAOQueries 
{
	String GENERATE_BOOKING_ID_QUERY = "select emp_id_seq.nextVal from dual";
	
	String VIEW_BUS_SCHEDULE_QUERY = "select * from BusSchedule";
	
}
