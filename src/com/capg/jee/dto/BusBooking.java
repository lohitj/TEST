//comment 
package com.capg.jee.dto;

public class BusBooking 
{
	private int busId;
	private String busName;
	private String startLocation;
	private String endLocation;
	private int availableSeats;
	private int bookingId;
	
	/***** Constructor using superClass *****/
	public BusBooking() 
	{
		super();
	}
	
	/***** Constructor using field values *****/
	public BusBooking(int busId, String busName, String startLocation, String endLocation, int availableSeats, int bookingId) 
	{
		super();
		this.busId = busId;
		this.busName = busName;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.availableSeats = availableSeats;
		this.bookingId = bookingId;
	}
	
	public BusBooking(int busId, String busName, String startLocation, String endLocation, int availableSeats) {
		super();
		this.busId = busId;
		this.busName = busName;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.availableSeats = availableSeats;
	}

	/***** Getters & Setters for busId *****/
	public int getBusId() 
	{
		return busId;
	}

	public void setBusId(int busId) 
	{
		this.busId = busId;
	}
	
	/***** Getters & Setters for busName *****/
	public String getBusName() 
	{
		return busName;
	}
	public void setBusName(String busName) 
	{
		this.busName = busName;
	}
	
	/***** Getters & Setters for startLocation *****/
	public String getStartLocation() 
	{
		return startLocation;
	}
	public void setStartLocation(String startLocation) 
	{
		this.startLocation = startLocation;
	}
	
	/***** Getters & Setters for endLocation *****/
	public String getEndLocation() 
	{
		return endLocation;
	}
	public void setEndLocation(String endLocation) 
	{
		this.endLocation = endLocation;
	}
	
	/***** Getters & Setters for availableSeats *****/
	public int getAvailableSeats() 
	{
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) 
	{
		this.availableSeats = availableSeats;
	}
	
	/***** Getters & Setters for bookingId *****/
	public int getBookingId() 
	{
		return bookingId;
	}
	public void setBookingId(int bookingId) 
	{
		this.bookingId = bookingId;
	}
	
	/***** toString Method *****/
	@Override
	public String toString() 
	{
		return "BusBooking [busId=" + busId + ", busName=" + busName + ", startLocation=" + startLocation
				+ ", endLocation=" + endLocation + ", availableSeats=" + availableSeats + ", bookingId=" + bookingId
				+ "]";
	}
}