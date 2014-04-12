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
		return _output;
	}
	
	/*
	 * Prompts master to end a round
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
				if (users.get(i).getIsPlaying()) {
					users.get(i).bet();
				}
			}
			if (endRound()) {
				update();
			}
		}
	}
	
	/*
	 * Updates users with winnings after betting rounds complete
	 */
	public void update() {
		
	}
	
	
	/*
	 * Adds masterUser as first user in users
	 */
	public static void main(String[] args) {
		User a = new User("This test code is less useful than Jan.");
		System.out.println(a);
	}

}
