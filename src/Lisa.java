/**
 * This class defines the Lisa AI opponent.
 * Lisa is equally as likely to generate one roshambo as another.
 * @author Chris
 *
 */
public class Lisa extends Player {
	String result = "";

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " chose " + result + ".";
	}
		
	@Override //This method produces a random roshambo value.
	String generateRoshambo() {	
		int range = 3; //For generating numbers from 1 - 3
		int rand = (int)(Math.random() * range) + 1; //+1 is added because casting to int truncates the float. 3.999 = 3, not 4.
		
		switch (rand) {
		case 1:
			result = Roshambo.Rock.getHand();
			System.out.println(this.toString());
			return result;
		case 2:
			result = Roshambo.Paper.getHand();
			System.out.println(this.toString());
			return result;
		case 3:
			result = Roshambo.Scissors.getHand();
			System.out.println(this.toString());
			return result;
		}
		return null;
	}

}
