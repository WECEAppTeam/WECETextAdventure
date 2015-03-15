import java.util.Scanner;

public class Processor {
	public static void main(String args[]){
		//generate a scanner to read from command line
		Scanner input = new Scanner(System.in);

		//print to screen
		System.out.println("What item do you need to complete your quest?");

		//read what the user inputs
		String userInput = input.nextLine();

		//respond to the screen
		System.out.println("I shall aid you in your quest to find " + userInput + ".");



		if(userInput.equals("a text adventure")){
			System.out.println("I shall aid you in your quest to find " + userInput + "!");	
		}
		else if(userInput.equals("Excalibur")){
			System.out.println("That is my favorite sword!");
		}
		else{
			System.out.println("I wish you luck on finding " + userInput + " on your adventure!");
		}

		//a repeated read loop
		System.out.println("What is the secret phrase?");
		boolean shouldKeepReading = true;
		while(shouldKeepReading){
			userInput = input.nextLine();
			if(userInput.equals("the secret phrase")){
				shouldKeepReading = false;
			}
			else{
				System.out.println("Incorrect phrase!");
			}
		}
		System.out.println("You win!");

		//close the Scanner
		input.close();
	}

}
