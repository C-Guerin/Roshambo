import java.util.Scanner;

/**
 * This class is the core of the Roshambo program.
 * This class instantiates Bart, Lisa, and Player1.
 * 
 * @author Chris
 * @version 1.0
 */

public class RoshamboApp {

	public static void main(String[] args) {		
		
		Bart bart = new Bart();
		Lisa lisa = new Lisa();
		Player1 User = new Player1();		
		Scanner sc = new Scanner(System.in);	
		String Foe = "";	
		int i = 0; //Used to infinitely loop the game.
		int playerWins = 0;
		int foeWins = 0;
		
		System.out.println("Welcome, " +User.GetName() +".");		
		System.out.println("\nPlease Select An Opponent.\nBart \t     Lisa");		
		
		//Loops until a valid foe is selected. 
		//Once a foe is selected, the user cannot select another.
		do { 
			Foe = User.ChooseFoe(sc.next());			
		}while(Foe == "");	
		
		do { //Generate Hands, Determine Victor, Iterate Score, Prompt for Exit. 		
			String playerHand = "";
			String foeHand = "";	
			String victor = "";
			String exitProgram = "";			
			
			playerHand = User.generateRoshambo();
			
			switch (Foe) {
			case "Bart":
				foeHand = bart.generateRoshambo();
				break;
			case "Lisa":
				foeHand = lisa.generateRoshambo();
				break;
			}
			
			//Hard-coded match resolution algorithm.
			if (playerHand == "Rock" && foeHand == "Rock") {
				victor = "";
				System.out.println("Its a tie.");				
			}
			if (playerHand == "Rock" && foeHand == "Paper") {
				victor = Foe;	
				System.out.println(victor + " wins.");				
			}
			if (playerHand == "Rock" && foeHand == "Scissors") {
				victor = User.GetName();				
				System.out.println(victor + " wins.");			
			}
			if (playerHand == "Paper" && foeHand == "Rock") {
				victor = User.GetName();				
				System.out.println(victor + " wins.");				
			}
			if (playerHand == "Paper" && foeHand == "Paper") {
				victor = "";
				System.out.println("Its a tie.");
			}
			if (playerHand == "Paper" && foeHand == "Scissors") {
				victor = Foe;	
				System.out.println(victor + " wins.");
			}	
			if (playerHand == "Scissors" && foeHand == "Rock") {
				victor = Foe;	
				System.out.println(victor + " wins.");					
			}
			if (playerHand == "Scissors" && foeHand == "Paper") {
				victor = User.GetName();				
				System.out.println(victor + " wins.");				
			}
			if (playerHand == "Scissors" && foeHand == "Scissors") {
				victor = "";
				System.out.println("Its a tie.");			
			}
			
			if (victor.equals(User.GetName())){
				playerWins += 1;	
			}
			if (victor.equals(Foe)) {
				foeWins += 1;
			}	
			
			System.out.println("\nScore is " + playerWins + " to " + foeWins + ".");			
			System.out.println("\n\nWould you like to keep playing? Y/N");
			exitProgram = sc.next();
			exitProgram = exitProgram.toUpperCase();
			if (exitProgram.equals("N") || exitProgram.equals("NO")) {
				break;
			}
			
		}while(i < 1); //Loops the game forever or until the player exits.	
		sc.close();		
	}

}
