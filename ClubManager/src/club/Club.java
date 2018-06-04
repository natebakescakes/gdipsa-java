package club;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Club {
	
	private int membershipNumber;
	private ArrayList<Member> members;
	private HashMap<String, Facility> facilities;
	private BookingRegister bookingRegister;

	public Club(int initMemberSize) {
		membershipNumber = 0;
		members = new ArrayList<Member>();
		facilities = new HashMap<String, Facility>();
		bookingRegister = new BookingRegister();
	}
	
	// Member Management
	
	public Member addMember(String firstName, String secondName, String surname) {
		membershipNumber++;
		
		Member member = new Member(firstName, secondName, surname, membershipNumber);
		members.add(member);
		
		return member;
	}
	
	public Member addMember(String firstName, String surname) {
		membershipNumber++;
		
		Member member = new Member(firstName, surname, membershipNumber);
		members.add(member);
		
		return member;
	}

	public void removeMember(int membershipNumber) {
		for (Member member : members) {
			if (member.getMembershipNumber() == membershipNumber) {
				members.remove(member);
				break;
			}
		}
		
		return;
	}
	
	public ArrayList<Member> getMembers() {
		return new ArrayList<Member>(members);
	}
	
	public Member getMember(int memberId) {
		for (Member member : members) {
			if (member.getMembershipNumber() == memberId) {
				return member;
			}
		}
		
		return null;
	}
	
	public void sortByMemNumber() {
		Collections.sort(this.members);
		
		return;
	}
	
	// Facility Management
	
	public Facility getFacility(String name) {
		return facilities.get(name);
	}
	
	public ArrayList<Facility> getFacilities() {
		ArrayList<Facility> facilities = new ArrayList<Facility>();
		
		for (Facility facility : this.facilities.values()) {
			facilities.add(facility);
		}
		
		return facilities;
	}
	
	public Facility addFacility(String name, String description) {
		Facility facility = new Facility(name, description);
		facilities.put(name, facility);
		
		return facility;
	}
	
	public Facility addFacility(String name) {
		Facility facility = new Facility(name);
		facilities.put(name, facility);
		
		return facility;
	}
	
	public void removeFacility(String name) {
		facilities.remove(name);
		
		return;
	}
	
	public void addBooking(
			int membershipNumber, String facilityName, LocalDateTime startDate, LocalDateTime endDate) 
			throws BadBookingException {
		
		bookingRegister.addBooking(
				members.stream().filter(x -> x.getMembershipNumber() == membershipNumber).findFirst().get(),
				facilities.get(facilityName), 
				startDate, 
				endDate);
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("Members:\n");
		for (Member member : members) {
			if (member != null) {
				sb.append(member);
				sb.append("\n");
			}
		}
		
		sb.append("\nFacilities: \n");
		for (Facility facility : facilities.values()) {
			if (facility != null) {
				sb.append(facility);
				sb.append("\n");
				
				if (bookingRegister.getBookings(facility, LocalDateTime.of(2017, 1, 1, 0, 0), 
						LocalDateTime.of(2018, 12, 31, 0, 0)) != null) {
					for (Booking booking : bookingRegister.getBookings(
							facility, 
							LocalDateTime.of(2017, 1, 1, 0, 0), 
							LocalDateTime.of(2018, 12, 31, 0, 0))) {
						sb.append(booking);
						sb.append("\n");
					}
				}
			}
		}
		
		return sb.toString();
	}
}
