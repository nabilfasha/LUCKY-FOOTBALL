package luckyFootball;

public class Manager {
	String[] name = {"JOSE MOURINHO"," JOSEP GUARDIOLA", "CARLO ANCELOTTI","HANSI FLICK",
				     "THOMAS TUCHEL"," JULIAN NAGELSMAN","DIEGO SIMEONE","RALF RAGNICK",
				     "MIKEL ARTETA","JURGEN KLOPP","STEVEN GERARD","SHIN TAE YONG","XAVI XERNANDEZ"};
	int randomName;
	String manager;
	
	Manager(){
		randomName = (int)(Math.random()*name.length);
		manager = name[randomName];
	}
	
	public String getManager() {
		return manager;
	}
}
