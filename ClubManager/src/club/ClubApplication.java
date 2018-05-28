package club;

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
		
		System.out.println(club);
	}

}
