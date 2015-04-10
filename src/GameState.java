
public class GameState {

	private boolean gameOn;
	public Location currentLocation;
	
	//constructor. Sets game to ON when created.
	public GameState() {
		this.gameOn = true;
		currentLocation = Map.generateMap();
	}

	

	public boolean isGameOn() {
		return gameOn;
	}

	public void setGameOn(boolean gameOn) {
		this.gameOn = gameOn;
	}

	public void get(String target) {
		// TODO Auto-generated method stub
		System.out.println("Getting " + target);
		if (target.equalsIgnoreCase("DOLLAR")){
			System.out.println("You get a dollar!");
		}
	}

	public void look(String target) {
		// TODO Auto-generated method stub
		System.out.println("Looking " + target);
	}

	public void use(String target) {
		// TODO Auto-generated method stub
		System.out.println("Using " + target);
	}

	public void attack(String target) {
		// TODO Auto-generated method stub
		System.out.println("Attacking " + target);
		if (target.equalsIgnoreCase("GOBLIN")){
			System.out.println("You kill the GOBLIN!");
		}
	}

	public void go(String target) {
		// TODO Auto-generated method stub
		System.out.println("Going " + target);
		if (target.equalsIgnoreCase("NORTH")){
			System.out.println("You go NORTH!");
		}
	}

	public void talk(String target) {
		// TODO Auto-generated method stub
		System.out.println("Talking  to" + target);
	}
	
	private void generateMap() {
		
	}
}
