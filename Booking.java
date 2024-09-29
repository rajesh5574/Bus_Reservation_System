package com.busreservation;
import java.text.ParseException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
public class Booking {

	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Passenger Name: ");
		passengerName = sc.next();
		System.out.println("Enter Bus No: ");
		busNo= sc.nextInt();
		System.out.println("Enter Date : dd-mm-yyyy");
		String dateInput = sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		
		try{
			date = dateFormat.parse(dateInput);
		}
		catch(ParseException e){
			e.printStackTrace();
		}
	}
	
	public boolean isAvailable() throws SQLException{
		BusDAO busdao = new BusDAO();
		BookingDAO bookingdao = new BookingDAO();
		int capacity= busdao.getCapacity(busNo);
		
		int booked= bookingdao.getBookedCount(busNo,date);
		
		return booked < capacity;
	}
}
