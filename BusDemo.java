package com.busreservation;

import java.sql.SQLException;
import java.util.*;

public class BusDemo {

	public static void main(String[] args) {

		try {
			BusDAO busdao = new BusDAO();
			busdao.displayBusInfo();

			int userOpt = 1;
			Scanner sc = new Scanner(System.in);

			while (userOpt == 1) {
				System.out.println("Enter : 1 to Book || 2 to Exit");
				userOpt = sc.nextInt();
				if (userOpt == 1) {
					Booking booking = new Booking();
					if (booking.isAvailable()) {
						BookingDAO bookingdao = new BookingDAO();
						bookingdao.addBooking(booking);
						System.out.println("Your Booking Sucessfully Confirmed");
					} else {
						System.out.println("Sorry!, Bus is Full. Try another Bus or Date.");
					}
				}

			}
			if (userOpt == 2) {
				System.out.println("ThankYou For Booking! Enjoy Your Journey!!! ");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
