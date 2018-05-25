package club;

public class ClubApplication {

	public static void main(String[] args) {
		
		Club club = new Club(5);
		System.out.println(club.addMember("John", "Milton", "Smith"));
		System.out.println(club.addMember("John", "Smith"));
		System.out.println(club.addMember("John", "Smith"));
		System.out.println(club.addMember("John", "Smith"));
		System.out.println(club.addMember("John", "Smith"));
		System.out.println(club.addMember("John", "Smith"));
		club.removeMember(2);

		System.out.println(club);
		
		System.out.println(new Facility("Basketball Court", "The club's one and only basketball court."));
		System.out.println(new Facility("Tennis Court"));
		
	}

}
