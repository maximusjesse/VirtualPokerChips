/** 
 * Jackpot is a subclass of the class User. 
 * @date 		04-12-2014
 * @author      Mark Qi
 */

package Core;

public class Jackpot extends User {
	/*
	 * Constructor,i nitializing the Jackpot class with preset name and value of 0
	 */

	public Jackpot() {
		super("Jackpot", 0);
	}

	/**
	 * Initializing the Jackpot class with preset name and value of 0
	 * @param numWinners 	the number of winners in a round
	 * @return 				returns the amt of points split to each person
	**/
	public float calcSplit(int numWinners) {
		return (this.getPoints() / ((float) numWinners));
	}
}