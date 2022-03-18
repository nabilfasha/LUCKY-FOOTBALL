package luckyFootball;

public class Player {
	int height;
	int weigth;
	int team;
	
	Player(){
		height = 165 + (int) (Math.random() * 35);
		weigth = 50 + (int) (Math.random() * 40);
		team = 0;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWeigth() {
		return weigth;
	}
}

class Team extends Player{
	String[] namaTeam  = { "Manchester City", "Manchester United", "Chelsea", "Real Madrid", "Fc Barcelona",
			"Athletico Madrid", "Paris Saint Germain", "Liverpool", "Arsenal", "Valencia", "Sevilla",
			"AC Milan", "Juventus", "Inter Milan" };
	String randomTeam;
	
	Team(){
		super();
		team = (int) (Math.random() * namaTeam.length);
	}
	
	public String getRandomTeam(){
		return namaTeam[team];
	}
}
