package com.capg.jee.exception;

public class BusBookingException extends Exception 
{
	public BusBookingException() 
	{
		
	}

	public BusBookingException(String arg0) 
	{
		super(arg0);
	}

	public BusBookingException(Throwable arg0) 
	{
		super(arg0);
	}

	public BusBookingException(String arg0, Throwable arg1) 
	{
		super(arg0, arg1);
	}

	public BusBookingException(String arg0, Throwable arg1, boolean arg2, boolean arg3) 
	{
		super(arg0, arg1, arg2, arg3);
	}

}
