/*
 * Class defines user properties and actions between Users
 */
package Core;

public class User {
	
	private String userID;
	private float points, pointsPushed;
	
	/*
	 * Gets user ID
	 * @return String Returns user ID
	 */
	public String getUserID() {
		return userID;		
	}
	
	/*
	 * Sets user id
	 * @param id String identifier to set user id
	 */
	public void setUserID(String id) {
		this.userID = id;	
	}
	
	/*
	 * Gets the amount of points user currently has	
	 */
	public float getPoints() {
		return points;
	}

}
