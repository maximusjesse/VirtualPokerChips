package Core;

import java.util.ArrayList;
import java.util.Scanner;

public class MasterUser extends User {
	// String userID
	// float points
	// float pointsPushed
	private boolean endRound;
	public MasterUser(String userID, float points) {
		super(userID, points);
	}
	
	/*
	 * Constructor
	 */
	public MasterUser(String userID) {
		super(userID);
	}
	
	/*
	 * Sets endRound variable
	 * @param b boolean to set endRound to
	 */
	public void setEndRound(boolean b) {
		this.endRound = b;
	}
	
	/*
	 * Gets endRound variable
	 * @return boolean endRound variable 
	 */
	public boolean getEndRound() {
		return endRound;
	}
	
	/*
	 * UNFINISHED
	 * Prompts master to indicate winners
	 */
	public int promptForWinners(ArrayList<User> users) {
		Scanner scan = new Scanner(System.in);	
		int winners = 0;
		int _winner = 1;
		while (_winner >= 0) {
			System.out.print("Type index of a winner: ");
			_winner = scan.nextInt();
			if (_winner < 0) {
				break;
			}
			users.get(_winner).setWinner(true);
			winners ++;
		}
		return winners;
	}

}