/**
 * Table holds a group of users and a jackpot, as well as processes back-end
 * calculations of score processing and interactions.
 */
package Core;

import java.util.ArrayList;

public class Table {
	private User currentUser;
	private ArrayList<User> users = new ArrayList<User>();
	private MasterUser masterUser;
	private Jackpot jackpot = new Jackpot();
	
	/*
	 * Constructor
	 */
	public Table(MasterUser master) {
		users.add(master);
		currentUser = master;
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
	 * Adds masterUser as first user in users
	 */
	public static void main(String[] args) {
		User a = new User("This test code is less useful than Jan.");
		System.out.println(a);
	}

}
