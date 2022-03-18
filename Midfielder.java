package luckyFootball;

import java.util.Scanner;

public class Midfielder extends Ability {
	Midfielder(){
		super();
		speed = 65 + (int) (Math.random() * 32);
		acceleration = 65 + (int) (Math.random() * 32);
		stamina= 65 + (int) (Math.random() * 32);
		dribbling = 70 + (int) (Math.random() * 27);
		control = 60 + (int) (Math.random() * 37);
		freeKick= 70 + (int) (Math.random() * 29);
		longPass= 70 + (int) (Math.random() * 27);
		shortPass= 70 + (int) (Math.random() * 27);
		crossing= 70 + (int) (Math.random() * 27);
		finishing = 75 + (int) (Math.random() * 22);
		longShot= 70 + (int) (Math.random() * 27);
		heading= 70 + (int) (Math.random() * 20);
		tackling= 50 + (int) (Math.random() * 35);
		strength = 65 + (int) (Math.random() * 34);
		namaKaki = (int) (Math.random() * kaki.length);
	}
	
	public String getRandomKaki() {
		return kaki[namaKaki];
	}
	
	@Override
	public int overall() {
		return super.overall()/14;
	}
	
	public void midfielder(int choose) {
		Scanner in = new Scanner(System.in);
		if (choose == 1) {
			System.out.print("\n<--> TYPE [2] TO UNLOCK YOUR NEW MIDFIELDER SKILL: ");
			choose = in.nextInt();
			System.out.println("SPEED: " + speed);
		}
		if (choose == 2) {
			System.out.print("\n<--> TYPE [3] TO UNLOCK YOUR NEW MIDFIELDER SKILL: ");
			choose = in.nextInt();
			System.out.println("ACCELERATION: " + acceleration);
		}
		if (choose == 3) {
			System.out.print("\n<--> TYPE [4] TO UNLOCK YOUR NEW MIDFIELDER SKILL: ");
			choose = in.nextInt();
			System.out.println("STAMINA: " + stamina);
		}
		if (choose == 4) {
			System.out.print("\n<--> TYPE [5] TO UNLOCK YOUR NEW MIDFIELDER SKILL: ");
			choose = in.nextInt();
			System.out.println("DRIBBLING: " + dribbling);
		}
		if (choose == 5) {
			System.out.print("\n<--> TYPE [6] TO UNLOCK YOUR NEW MIDFIELDER SKILL: ");
			choose = in.nextInt();
			System.out.println("CONTROL: " + control);
		}
		if (choose == 6) {
			System.out.print("\n<--> TYPE [7] TO UNLOCK YOUR NEW MIDFIELDER SKILL: ");
			choose = in.nextInt();
			System.out.println("FREE KICK: " + freeKick);
		}
		if (choose == 7) {
			System.out.print("\n<--> TYPE [8] TO UNLOCK YOUR NEW MIDFIELDER SKILL: ");
			choose = in.nextInt();
			System.out.println("LONG PASS: " + longPass);
		}
		if (choose == 8) {
			System.out.print("\n<--> TYPE [9] TO UNLOCK YOUR NEW MIDFIELDER SKILL: ");
			choose = in.nextInt();
			System.out.println("SHORT PASS: " + shortPass);
		}
		if (choose == 9) {
			System.out.print("\n<--> TYPE [10] TO UNLOCK YOUR NEW MIDFIELDER SKILL: ");
			choose = in.nextInt();
			System.out.println("CROSSING: " + crossing);		}
		if (choose == 10) {
			System.out.print("\n<--> TYPE [11] TO UNLOCK YOUR NEW MIDFIELDER SKILL: ");
			choose = in.nextInt();
			System.out.println("FINISHING: " + finishing);
		}
		if (choose == 11) {
			System.out.print("\n<--> TYPE [12] TO UNLOCK YOUR NEW MIDFIELDER SKILL: ");
			choose = in.nextInt();
			System.out.println("LONG SHOT: " + longShot);
		}
		if (choose == 12) {
			System.out.print("\n<--> TYPE [13] TO UNLOCK YOUR NEW MIDFIELDER SKILL: ");
			choose = in.nextInt();
			System.out.println("HEADING: " + heading);		}
		if (choose == 13) {
			System.out.print("\n<--> TYPE [14] TO UNLOCK YOUR NEW MIDFIELDER SKILL: ");
			choose = in.nextInt();
			System.out.println("TACKLING: " + tackling);
		}
		if (choose == 14) {
			System.out.print("\n<--> TYPE [15] TO UNLOCK YOUR NEW MIDFIELDER SKILL: ");
			choose = in.nextInt();
			System.out.println("STRENGTH: " + strength);
		}
		if (choose == 15) {
			System.out.print("\n<--> TYPE [16] TO UNLOCK YOUR NEW MIDFIELDER SKILL: ");
			choose = in.nextInt();
			System.out.println("PREFFERED FOOD : " + getRandomKaki().toUpperCase());
		}
		if (choose == 16) {
			System.out.print("\n<--> TYPE [17] TO UNLOCK YOUR NEW STRIKER SKILL: ");
			choose = in.nextInt();
			Team tim = new Team();
			System.out.println("TEAM NOW: " + tim.getRandomTeam().toUpperCase());
		}
		if (choose == 17) {
			System.out.print("\n<--> TYPE [18] TO UNLOCK YOUR NEW MIDFIELDER SKILL: ");
			choose = in.nextInt();
			Team tim = new Team();
			int weightMidfielder = tim.getWeigth();
			System.out.println("WEIGHT: " + weightMidfielder);
		}
		if (choose == 18) {
			System.out.print("\n<--> TYPE [19] TO UNLOCK YOUR NEW MIDFIELDER SKILL: ");
			choose = in.nextInt();
			Team tim = new Team();
			int heightMidfielder = tim.getHeight();
			System.out.println("HEIGHT: " + heightMidfielder + "cm");
		}
		if (choose == 19) {
			System.out.print("\n<--> TYPE [20] TO UNLOCK YOUR NEW MANAGER: ");
			choose = in.nextInt();
			Manager objManager = new Manager();
			String manager = objManager.getManager();
			System.out.println("MANAGER: "+manager);
		}
		if (choose == 20) {
			int overall = overall();
			System.out.println("\nOVERALL: " + overall);
		}
		in.close();
	}
	
}
