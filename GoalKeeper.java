package luckyFootball;

import java.util.Scanner;

public class GoalKeeper extends Ability {
	int GK_Ability;
	GoalKeeper(){
		super();
		speed = 50 + (int) (Math.random() * 30);
		acceleration = 50 + (int) (Math.random() * 30);
		stamina= 75 + (int) (Math.random() * 22);
		dribbling = 50 + (int) (Math.random() * 30);
		control = 60 + (int) (Math.random() * 37);
		freeKick= 50 + (int) (Math.random() * 32);
		longPass= 60 + (int) (Math.random() * 27);
		shortPass= 60 + (int) (Math.random() * 27);
		crossing= 60 + (int) (Math.random() * 27);
		finishing = 20 + (int) (Math.random() * 30);
		longShot= 60 + (int) (Math.random() * 27);
		heading= 60 + (int) (Math.random() * 25);
		tackling= 60 + (int) (Math.random() * 20);
		strength = 70 + (int) (Math.random() * 20);
		namaKaki = (int) (Math.random() * kaki.length);
		GK_Ability = 70+ (int)(Math.random()* 29);
	}
	
	public String getRandomKaki() {
		return kaki[namaKaki];
	}
	
	@Override
	public int overall() {
		return (super.overall()+GK_Ability)/15;
	}
	
	public void goalkeeper(int choose) {
		Scanner in = new Scanner(System.in);
		if (choose == 1) {
			System.out.print("\n<--> TYPE [2] TO UNLOCK YOUR NEW GOALKEEPER SKILL: ");
			choose = in.nextInt();
			System.out.println("SPEED: " + speed);
		}
		if (choose == 2) {
			System.out.print("\n<--> TYPE [3] TO UNLOCK YOUR NEW GOALKEEPER SKILL: ");
			choose = in.nextInt();
			System.out.println("ACCELERATION: " + acceleration);
		}
		if (choose == 3) {
			System.out.print("\n<--> TYPE [4] TO UNLOCK YOUR NEW GOALKEEPER SKILL: ");
			choose = in.nextInt();
			System.out.println("STAMINA: " + stamina);
		}
		if (choose == 4) {
			System.out.print("\n<--> TYPE [5] TO UNLOCK YOUR NEW GOALKEEPER SKILL: ");
			choose = in.nextInt();
			System.out.println("DRIBBLING: " + dribbling);
		}
		if (choose == 5) {
			System.out.print("\n<--> TYPE [6] TO UNLOCK YOUR NEW GOALKEEPER SKILL: ");
			choose = in.nextInt();
			System.out.println("CONTROL: " + control);
		}
		if (choose == 6) {
			System.out.print("\n<--> TYPE [7] TO UNLOCK YOUR NEW GOALKEEPER SKILL: ");
			choose = in.nextInt();
			System.out.println("FREE KICK: " + freeKick);
		}
		if (choose == 7) {
			System.out.print("\n<--> TYPE [8] TO UNLOCK YOUR NEW GOALKEEPER SKILL: ");
			choose = in.nextInt();
			System.out.println("LONG PASS: " + longPass);
		}
		if (choose == 8) {
			System.out.print("\n<--> TYPE [9] TO UNLOCK YOUR NEW GOALKEEPER SKILL: ");
			choose = in.nextInt();
			System.out.println("SHORT PASS: " + shortPass);
		}
		if (choose == 9) {
			System.out.print("\n<--> TYPE [10] TO UNLOCK YOUR NEW GOALKEEPER SKILL: ");
			choose = in.nextInt();
			System.out.println("CROSSING: " + crossing);
		}
		if (choose == 10) {
			System.out.print("\n<--> TYPE [11] TO UNLOCK YOUR NEW GOALKEEPER SKILL: ");
			choose = in.nextInt();
			System.out.println("FINISHING: " + finishing);
		}
		if (choose == 11) {
			System.out.print("\n<--> TYPE [12] TO UNLOCK YOUR NEW GOALKEEPER SKILL: ");
			choose = in.nextInt();
			System.out.println("LONG SHOT: " + longShot);
		}
		if (choose == 12) {
			System.out.print("\n<--> TYPE [13] TO UNLOCK YOUR NEW GOALKEEPER SKILL: ");
			choose = in.nextInt();
			System.out.println("HEADING: " + heading);
		}
		if (choose == 13) {
			System.out.print("\n<--> TYPE [14] TO UNLOCK YOUR NEW GOALKEEPER SKILL: ");
			choose = in.nextInt();
			System.out.println("TACKLING: " + tackling);
		}
		if (choose == 14) {
			System.out.print("\n<--> TYPE [15] TO UNLOCK YOUR NEW GOALKEEPER SKILL: ");
			choose = in.nextInt();
			System.out.println("STRENGTH: " + strength);
		}
		if (choose == 15) {
			System.out.print("\n<--> TYPE [16] TO UNLOCK YOUR NEW GOALKEEPER SKILL: ");
			choose = in.nextInt();
			System.out.println("GOALKEEPING: " + GK_Ability);
		}
		if (choose == 16) {
			System.out.print("\n<--> TYPE [17] TO UNLOCK YOUR NEW GOALKEEPER SKILL: ");
			choose = in.nextInt();
			System.out.println("PREFFERED FOOD : " + getRandomKaki().toUpperCase());
		}
		if (choose == 17) {
			System.out.print("\n<--> TYPE [18] TO UNLOCK YOUR NEW STRIKER SKILL: ");
			choose = in.nextInt();
			Team tim = new Team();
			System.out.println("TEAM NOW: " + tim.getRandomTeam().toUpperCase());
		}
		if (choose == 18) {
			System.out.print("\n<--> TYPE [19] TO UNLOCK YOUR NEW GOALKEEPER SKILL: ");
			choose = in.nextInt();
			Team tim = new Team();
			int weightGoalKeeper = tim.getWeigth();
			System.out.println("WEIGHT: " + weightGoalKeeper);
		}
		if (choose == 19) {
			System.out.print("\n<--> TYPE [20] TO UNLOCK YOUR NEW GOALKEEPER SKILL: ");
			choose = in.nextInt();
			Team tim = new Team();
			int heightGoalKeeper = tim.getHeight();
			System.out.println("HEIGHT: " + heightGoalKeeper + "cm");
		}
		if (choose == 20) {
			System.out.print("\n<--> TYPE [21] TO UNLOCK YOUR NEW MANAGER: ");
			choose = in.nextInt();
			Manager objManager = new Manager();
			String manager = objManager.getManager();
			System.out.println("MANAGER: "+manager);
		}
		if (choose == 21) {
			int overall = overall();
			System.out.println("\nOVERALL: " + overall);
		}
		in.close();
	}
	
}
