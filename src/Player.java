/**
 * This abstract class contains defines the roshambo values and outlines abstract functions for inheritance. 
 * These abstract functions are inherited by Bart, Lisa, and Player1.
 * Creates a common function for generating roshambo values, as well as getters and setters for player names and roshambo values.
 * @author Chris
 *
 */
public abstract class Player {
	
	//Enum with 3 variables, each assigned a string value that is their name.
	enum Roshambo {		
		Rock("Rock"),
		Paper("Paper"),
		Scissors("Scissors");
		
		private final String hand; //Defines the value to the variable. the ("Rock") in Rock.
		Roshambo(String Result){
			hand = Result;
		}
		public String getHand() { //Gets the name of string value to the enum variable.
			return hand;
		}
	}	
	
	abstract String generateRoshambo(); //Abstract method for generating roshambo values.
	
	private String Name;

	public String GetName(){
		return Name; //Gets the name of the player.
	}

	public void SetName(String Name){
		this.Name = Name; //Gets the name of the player.
	}

}
