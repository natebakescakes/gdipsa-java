package club;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class BookingRegister {
	private HashMap<Facility, ArrayList<Booking>> bookingRegister;

	public BookingRegister() {
		super();
		this.bookingRegister = new HashMap<Facility, ArrayList<Booking>>();
	}
	
	public void addBooking(Member member, Facility facility, LocalDateTime startDate, LocalDateTime endDate) 
			throws BadBookingException {
		Booking booking;
		
		booking = new Booking(member, facility, startDate, endDate);
		
		if (this.bookingRegister.get(facility) == null) {
			// Instantiate ArrayList and add booking into list
			ArrayList<Booking> bookings = new ArrayList<Booking>();
			bookings.add(booking);
			
			// Map booking list into booking register with facility as key
			this.bookingRegister.put(facility, bookings);
		} else {
			for (Booking b : this.bookingRegister.get(facility)) {
				if (b.overlaps(booking)) {
					throw new BadBookingException();
				}
			}
			
			this.bookingRegister.get(facility).add(booking);
		}
	}

	public ArrayList<Booking> getBookings(
			Facility facility, LocalDateTime startDateRange, LocalDateTime endDateRange) {
		if (this.bookingRegister.get(facility) == null) return new ArrayList<Booking>();
		
		ArrayList<Booking> bookingResult = new ArrayList<Booking>();
		
		for (Booking b : this.bookingRegister.get(facility)) {
			if (b.getStartDate().isAfter(startDateRange) && b.getEndDate().isBefore(endDateRange)) {
				bookingResult.add(b);
			}
		}
		
		return bookingResult;
	}
	
	public void removeBooking(Booking booking) {
		this.bookingRegister.get(booking.getFacility()).remove(booking);
		
		return;
	}
}
