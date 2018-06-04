package club;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ClubApplication {

	public static void main(String[] args) {
		
		Club club = new Club(5);
		
		club.addMember("John", "Milton", "Smith");
		club.addMember("Tan", "Ah", "Kow");
		club.addMember("Lee", "Kuan", "Yew");
		club.addMember("Christopher", "Robin");
		club.addMember("Haley", "Joel", "Osmont");
		club.addMember("Dead", "Pool");
		
		club.removeMember(2);
		
		club.addFacility("Basketball Court", "The club's one and only basketball court");
		club.addFacility("Tennis Court");
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d-MMM-yyyy H:mm");
		LocalDateTime startDate = LocalDateTime.parse("01-Jun-2018 9:00", dateFormat);
		LocalDateTime endDate = LocalDateTime.parse("02-Jun-2018 09:00", dateFormat);
		
		try {
			club.addBooking(1, "Basketball Court", startDate, endDate);
		} catch (BadBookingException e) {
			System.out.println("Bad booking.");
		}
		
		System.out.println(club);
	}

}
