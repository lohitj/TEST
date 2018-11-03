package com.capg.jee.ui;

import java.util.Scanner;

import com.capg.jee.service.BusBookingServiceImpl;
import com.capg.jee.service.IBusBookingService;

public class BBSUI implements MenuChoice
{
	private IBusBookingService busBookService;
	
	public BBSUI() 
	{
		busBookService = new BusBookingServiceImpl();
	}

	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("1) View Bus Schedule");
		System.out.println("2) Book A Bus");
		System.out.println("3) Exit");
		
		System.out.println("\nSelect an option from the above menu\n");
		int choice = console.nextInt();
		
		switch(choice)
		{
			case VIEW_BUS_SCHEDULE:
				List<BusBooking> busBook = busBookService.
				break;
			
			case BOOK_A_BUS:
				break;
				
			case EXIT_APPLICATION:
				System.out.println("Thank You For Using Blue Bus Booking System");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid option selected. Please try again");
		}
	}

}
