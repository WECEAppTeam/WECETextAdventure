public class Map {
	static Location generateMap(){
		String description = "\n";
		description += "A GOBLIN sits upon a rock. He looks ready to fight. He guards a DOLLAR.";
		Location L1 = new Location(description);
		
		description = "\nYou reached a grassy field of perfection that is good enough! Good job!\n";
		description += "You see a SWORD.";
		Location L2 = new Location(description);
		
		description ="\nYou walk upon a lava encrusted hill.";
		Location L3 = new Location(description);
		
		return L1;
		
		//link locations
		//L1.set
	}

}
