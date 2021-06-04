/**
 * This class is for the player to input his actions into the game.
 * The player may specify his Name, AI opponent, and roshambo value.
 * All user input strings are formatted to title case after programatically.  
 * @author Chris
 */
import java.util.Scanner;
public class Player1 extends Player{
	
	Scanner sc = new Scanner(System.in);	
	//This method is for the user to input his hand, which is converted to a roshambo value.
	//Valid user inputs are full names such as "Rock", letters such as "R", and numbers such as "1".
	@Override
	String generateRoshambo() {
		String Hand = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("\r");
		System.out.println("Please choose your hand.");
		boolean pass = false; //pass token for the do loop below.				
		
		do {	//Loops until the user inputs a valid hand.		
			if (sc.hasNext()) {
				Hand = sc.next();
			}
			Hand = Hand.toUpperCase();	
								
			if (Hand.equals("ROCK") || Hand.equals("R") || Hand.equals("1")) {
				Hand = "Rock";
				pass = true;
				//System.out.println(Hand);
			}
			else if (Hand.equals("PAPER") || Hand.equals("P") || Hand.equals("2")){
				Hand = "Paper";
				pass = true;
				//System.out.println(Hand);
			}
			else if (Hand.equals("SCISSORS") || Hand.equals("S") || Hand.equals("3")) {
				Hand = "Scissors";
				pass = true;
				//System.out.println(Hand);
			}
			else {
				//System.out.println("Invalid hand selection.");
				pass = false;
				System.out.println(Hand);
			}
		
		}while (pass == false); //Loop until valid input is entered.
		System.out.println("\n" + this.GetName() + " chose " + Hand + ".");		
		return Hand;		
	}	
	
public Player1(){	
	//Asks the user to enter in their name, formats to title case, and sets it.
	System.out.println("Enter Your Name.");
	String name = sc.next().toLowerCase();
	name = name.substring(0, 1).toUpperCase() + name.substring(1, name.length()); //Format name to title case.
	SetName(name);	
}

public String ChooseFoe(String FoeName){
	//Function for the user to select an opponent.
	//User may input Bart or Lisa regardless of case.
	String Foe = "";		
	if(FoeName.toUpperCase().equals("BART")){		
		Foe = "Bart";
		System.out.println("\n" + this.GetName() + " is playing against " + Foe + ".");		
	}	
	else if(FoeName.toUpperCase().equals("LISA")){		
		Foe = "Lisa";
		System.out.println("\n" + this.GetName() + " is playing against " + Foe + ".");
	}	
	else{
		System.out.println("\"" + FoeName + "\" is invalid, please enter either Bart or Lisa.");
		Foe = "";
	}		
	return Foe;
}

}
