package club;

import java.time.LocalDateTime;

public class Booking {
	private Member member;
	private Facility facility;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	public Booking(Member member, Facility facility, LocalDateTime startDate, LocalDateTime endDate) 
		throws BadBookingException {
		super();
		
		// Validation
		if (member == null || facility == null || startDate == null || endDate == null) {
			throw new BadBookingException("One of the arguments are null");
		} else if (startDate.isAfter(endDate)) {
			throw new BadBookingException("Start date is after end date");
		}
		
		this.member = member;
		this.facility = facility;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Member getMember() {
		return member;
	}

	public Facility getFacility() {
		return facility;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}
	
	public boolean overlaps(Booking other) {
		if ((this.startDate.isBefore(other.getEndDate()) && other.getStartDate().isBefore(this.endDate)) &&
				this.facility.equals(other.getFacility()))
			return true;
		
		return false;
	}
}
