package com.capg.jee.dao;
//commented
<<<<<<< HEAD
//comment for testing purpose
=======
>>>>>>> 2c17899... comment
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.capg.jee.dto.BusBooking;
import com.capg.jee.exception.BusBookingException;
import com.capg.jee.util.DBUtil;

public class BusBookingDAOImpl implements IBusBookingSystemDAO, IBusBookingDAOQueries
{
	/*
	 * Author		: Kapil Garg
	 * Emp Id		: 137648
	 * Date			: 25/10/2017
	 * Description	: View Bus Schedule
	*/
	@Override
	public List<BusBooking> viewBusSchedule() throws BusBookingException 
	{
		List<BusBooking> busBook =  null;
		try(Connection con=com.capg.jee.util.DBUtil.getConnection())
		{
			Statement stm = con.createStatement();
			
			ResultSet rs = stm.executeQuery(VIEW_BUS_SCHEDULE_QUERY) ;
			
			busBook = new ArrayList<>();
			
			while(rs.next())
			{
				BusBooking busBooking = new BusBooking();
				
				busBooking.setBusId(rs.getInt(1));
				busBooking.setBusName(rs.getString(2));
				busBooking.setStartLocation(rs.getString(3));
				busBooking.setEndLocation(rs.getString(4));
				busBooking.setAvailableSeats(rs.getInt(5));
				
				busBook.add(busBooking);
			}
			if(busBook.isEmpty()) 
			{
				throw new Exception ("No record found");
			}
		}
		catch(Exception e)
		{
			 new BusBookingException(e.getMessage());
		}
		
		return busBook;
	}
	
	public BusBookingDAOImpl() 
	{
		try(Connection con=com.capg.jee.util.DBUtil.getConnection())
		{
			
		}
		catch(Exception e)
		{
			 new BusBookingException(e.getMessage());
		}
	}
	
	/*
	 * Author		: Kapil Garg
	 * Emp Id		: 137648
	 * Date			: 25/10/2017
	 * Description	: Booking the bus based on the Bus ID
	*/
	@Override
	public int bookBus(BusBooking busBook) throws BusBookingException 
	{
		try(Connection con=com.capg.jee.util.DBUtil.getConnection())
		{
			
		}
		catch(Exception e)
		{
			 new BusBookingException(e.getMessage());
		}
		
		return 0;
	}
	
	/*
	 * Author		: Kapil Garg
	 * Emp Id		: 137648
	 * Date			: 25/10/2017
	 * Description	: Generating the bus bookingId from the sequence bus_id_seq
	*/
	public int generateBookingId() throws BusBookingException
	{
		int bookingId = 0;
		
		try(Connection con=DBUtil.getConnection())
		{
			Statement stm= con.createStatement();
			
			ResultSet res=stm.executeQuery(GENERATE_BOOKING_ID_QUERY);
			if(res.next() == false)
			{	
				throw new Exception("We are Sorry, there are no more seats available on the selected bus, please select another bus.");
			}
			
			bookingId=res.getInt(1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new BusBookingException(e.getMessage());
		}
		
		return bookingId;
	}
}
