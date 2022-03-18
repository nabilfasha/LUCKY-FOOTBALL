package luckyFootball;

public class Ability {
	protected int speed;
	protected int acceleration;
	protected int stamina;
	protected int dribbling;
	protected int control;
	protected int freeKick;
	protected int longPass;
	protected int shortPass;
	protected int crossing;
	protected int finishing;
	protected int longShot;
	protected int heading;
	protected int tackling;
	protected int strength;
	protected String[] kaki = { "RIGHT", "LEFT" };
	protected String randomKaki;
	protected int namaKaki;
	
	public Ability(){
		speed = 0;
		acceleration = 0;
		stamina = 0;
		dribbling = 0;
		control = 0;
		freeKick = 0;
		longPass = 0;
		shortPass = 0;
		crossing = 0;
		finishing = 0;
		longShot = 0;
		heading = 0;
		tackling = 0;
		strength = 0;
		randomKaki= null;
		namaKaki = 0;
	}
	
	public int overall() {
		return (speed + acceleration + stamina + dribbling + control
				+ freeKick + longPass + shortPass + crossing + finishing
				+ longShot + heading + strength+tackling);
	}
	
}
