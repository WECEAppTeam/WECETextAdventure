import java.util.Scanner;

public class Processor {
	
	//This error is written when the command is unknown.
	private final static String GENERIC_ERROR_MESSAGE = "Command not recognized. Please type \"help\" for legal commands.";
	
	public static void main(String args[]){
		//generate a scanner to read from command line
		Scanner input = new Scanner(System.in);

		//make a game
		GameState gameState = new GameState();
		while(gameState.isGameOn()){
			
			//Call to input
			System.out.println();
			System.out.println("What would thou like to do?");
			
			//read what the user inputs
			String userInput = input.nextLine();
			
			//break message into parts sparated by the spaces. 
			//	for example, "get sword" becomes ["get", "sword"].
			String[] userInputParts = userInput.split(" ");
			
			//check for accidental enter
			if (userInput.equalsIgnoreCase("")){
				//do nothing
			}
			//check for "help" and "quit"
			else if (userInput.equalsIgnoreCase("help")){
				System.out.println();
				System.out.println("COMMANDS:");
				System.out.println("QUIT: exits game.");
				System.out.println("LOOK: examines the current location.");
				System.out.println("LOOK <TARGET>: examines the target.");
				System.out.println("LOOK SELF: examines your stats and inventory.");
				System.out.println("USE <ITEM/SPELL>: uses an item or spell.");
				System.out.println("ATTACK <TARGET>: uses melee attack.");
				System.out.println("GO <TARGET>: goes to target location.");
				System.out.println("TALK <TARGET>: talks to a target.");
			}
			else if (userInput.equalsIgnoreCase("quit")){
				System.out.println();
				System.out.println("EXITING. GG.");
				gameState.setGameOn(false);
				break;
			}
			//for general looking at a location
			else if (userInput.equalsIgnoreCase("look")){
				System.out.println(gameState.currentLocation.getDescription());
			}
			//check if the number of inputs is illegal
			else if (userInputParts.length != 2) {
				System.out.println();
				System.out.println(GENERIC_ERROR_MESSAGE);
			}
			//legal other commands are get, look, use, attack, go, and talk.
			//userInputParts[0] is the action, userInputParts[1] is the target.
			else {
				switch (userInputParts[0]) {
				case "get":
					gameState.get(userInputParts[1]);
					break;
				case "look":
					gameState.look(userInputParts[1]);
					break;
				case "use":
					gameState.use(userInputParts[1]);
					break;
				case "attack":
					gameState.attack(userInputParts[1]);
					break;
				case "go":
					gameState.go(userInputParts[1]);
					break;
				case "talk":
					gameState.talk(userInputParts[1]);
					break;
				default: 
					System.out.println();
					System.out.println(GENERIC_ERROR_MESSAGE);
				}
			}
	
		}
		

		//close the Scanner
		input.close();
	}

}
