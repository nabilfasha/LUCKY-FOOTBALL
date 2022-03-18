package luckyFootball;
import java.util.*;


public class Main {
	
	private static void regulation() {
		System.out.println("\n1. INI ADALAH PERMAINAN LUCKY FOOTBALL\n"+
							"2. ANDA AKAN MENDAPATKAN PEMAIN, CLUB,\n   DAN PELATIH SECARA ACAK\n"+
							"3. SELAIN ITU ANDA JUGA DAPAT MELIHAT\n   OVERALL DARI PEMAIN YANG ANDA DAPATKAN"	);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String choice; int choose; 
		
		Striker objStriker = new Striker();
		Midfielder objMidfield = new Midfielder();
		Defender objDefend = new Defender();
		GoalKeeper objGk = new GoalKeeper();
		
		System.out.println(
				"<----------------------<->----------------------> \n<----------------------   ----------------------> \n<-----------------------------------------------> \n<-----------------LUCKY FOOTBALL----------------> \n<-----------------------------------------------> \n<----------------------   ----------------------> \n<----------------------<->---------------------->");
		System.out.print("ARE YOU READY TO PLAYING THE GAME? \n"+"YES OR NO ? "); 
		choice = in.nextLine();
		
		if(choice.equalsIgnoreCase("yes"))
		{
			System.out.print("\n=============== GAMES REGULATION ================");regulation();
		}else {
			System.out.println("Okeeyy Have A Nice Day :))");
			System.exit(0);
		}
		
		System.out.print("\n<--> TYPE [1] TO UNLOCK YOUR NEW PLAYER POSITION: ");
		choose = in.nextInt();
		String[] position = { "LEFT WING FORWARD", "CENTRAL FORWARD", "SECOND STRIKER", "RIGHT WING FORWARD",
							  "ATTACKING MIDFIELDER", "CENTRAL MIDFIELDER", "DEFENSIVE MIDFIELDER", 
							  "CENTRE-BACK", "RIGHT-BACK", "LEFT-BACK", "GOALKEEPER" };
		
		int randomPosition = (int) (Math.random() * position.length);
		String acakPosisi = position[randomPosition];
		if(acakPosisi.equalsIgnoreCase("LEFT WING FORWARD")||acakPosisi.equalsIgnoreCase("CENTRAL FORWARD")||acakPosisi.equalsIgnoreCase("SECOND STRIKER")||acakPosisi.equalsIgnoreCase("RIGHT WING FORWARD")) {
			System.out.println("<--> POSITION = " + acakPosisi + " <-->");
			objStriker.striker(choose);

		}else if(acakPosisi.equalsIgnoreCase("ATTACKING MIDFIELDER")||acakPosisi.equalsIgnoreCase("CENTRAL MIDFIELDER")||acakPosisi.equalsIgnoreCase("DEFENSIVE MIDFIELDER")){
			System.out.println("<--> POSITION = " + acakPosisi + " <-->");
			objMidfield.midfielder(choose);
		}else if(acakPosisi.equalsIgnoreCase("CENTRE-BACK")||acakPosisi.equalsIgnoreCase("RIGHT-BACK")||acakPosisi.equalsIgnoreCase("LEFT-BACK")) {
			System.out.println("<--> POSITION = " + acakPosisi + " <-->");
			objDefend.defender(choose);
		}else if(acakPosisi.equalsIgnoreCase("GOALKEEPER")){
			System.out.println("<--> POSITION = " + acakPosisi + " <-->");
			objGk.goalkeeper(choose);
		}
		in.close();
		
		
	}

}
