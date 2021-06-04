/**
 * This class is for the bart AI opponent.
 * Bart is simple, and such will always return the Rock roshambo value.
 * @author Chris
 *
 */
public class Bart extends Player {

	String result = "";
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " chose " + result + ".";
	}
	
	@Override //This method produces a static roshambo value of Rock.
	String generateRoshambo() {
		result = Roshambo.Rock.getHand();
		System.out.println(this.toString());
		return result;		
	}

}
