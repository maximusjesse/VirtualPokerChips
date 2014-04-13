/**
 * Table holds a group of users and a jackpot, as well as processes back-end
 * calculations of score processing and interactions.
 */
package Core;

import java.util.ArrayList;
import java.util.Scanner;

public class Table {
	private User currentUser;
	private ArrayList<User> users = new ArrayList<User>();
	private MasterUser masterUser;
	public static Jackpot jackpot;
	
	/*
	 * Constructor
	 */
	public Table(MasterUser master) {
		users.add(master);
		this.masterUser = master;
		currentUser = master;
		this.jackpot = new Jackpot();
	}
	
	/*
	 * Adds a user to the array list of users
	 * @param u User to be added
	 */
	public void addUser(User u) {
		users.add(u);
	}
	
	/*
	 * Sets a user's points to a new value
	 * @param u User to update
	 * @param f New float difference value to update User point value to
	 */
	public void setPoints(User u, float f) {
		u.setPoints(u.getPoints() + f);
	}
	
	/*
	 * Prints out scoreboard by using toString for every single user
	 * @return String Text scoreboard of users
	 */
	public String scoreboard() {
		String _output = String.format("%-20s%12s", "Player ID", "Current Points");
		for(int i = 0; i < users.size(); i++) {
			_output += "\n" + users.get(i).toString();			
		}
		_output += "\n" + jackpot.toString();
		return _output;
	}
	
	/*
	 * UNFINISHED
	 * Prompts master to end a round, needs to be changed when implementing interface
	 * @return boolean If master ends round, returns true, false otherwise
	 */
	public boolean endRound() {
		System.out.println("End round?");
		Scanner scan = new Scanner(System.in);
		masterUser.setEndRound(scan.nextBoolean());
		return masterUser.getEndRound();
	}
	
	/*
	 * Collects a round of user bets, pools it into the jackpot, then prompts master
	 * to end round;
	 */
	public void playARound() {
		while (!this.masterUser.getEndRound()) {  
			for (int i = 0; i < users.size() - 1; i++) {
				if (users.get(i).isPlaying()) {
					users.get(i).bet();
				}
			}
			if (endRound()) {
				update();
			}
		}
	}
	
	/*
	 * UNFINISHED
	 * Updates users with winnings after betting rounds complete
	 * Prompts masterUser to point out the winners, needs to be changed when implementing interface
	 */
	public void update() {
		int _numWinners = masterUser.promptForWinners(users);
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).isWinner()) {
				setPoints(users.get(i), jackpot.calcSplit(_numWinners));
			}
		}
		jackpot.setPoints(0.0f);
		for (int i = 0; i < users.size(); i++) {
			users.get(i).setWinner(false);
		}
		System.out.println(scoreboard());				
	}
}
