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
		u.setPoints(f);
	}
	
	
	/*
	 * Adds masterUser as first user in users
	 */
	public static void main(String[] args) {
		users.add(masterUser);
	}

}
