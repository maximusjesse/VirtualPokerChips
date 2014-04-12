/*
 * Class defines user properties and actions between Users
 */
package Core;

public class User {
	
	private String userID;
	private float points, pointsPushed = 0;
	
	
	/*
	 * Constructor
	 */
	public User(String id) {
		this.userID = id;
	}
	
	/*
	 * Constructor
	 */
	public User(String id, float p) {
		this.userID = id;
		this.points = p;
	}
	
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
	 * @return float User points returned
	 */
	public float getPoints() {
		return points;
	}
	
	/*
	 * Sets the amount of points user currently has
	 * @param float Points to be updated to
	 */
	public void setPoints(float f) {
		this.points = f;
	}
	
	/*
	 * Sets the amount of points to be pushed out to be changed
	 * @param p New value to change to
	 */
	public void setPointsPushed(float p) {
		this.pointsPushed = p;	
	}
	
	/*
	 * Gets points pushed
	 * @return float Points pushed
	 */
	public float getPointsPushed() {
		return pointsPushed;
	}
	
	/*
	 * toString method for user id and points
	 * @return String toString()
	 */
	public String toString() {
		return String.format("%-12s %.2f", userID, points);
	}
	
}
