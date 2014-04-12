/*
 * Class defines user properties and actions between Users
 */
package Core;

public class User {
	
	private String userID;
	private float points, pointsPushed = 0;
	
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
	 * Sets the amount of points to be pushed out to be changed
	 * @param p New value to change to
	 */
	public void setPointsPushed(float p) {
		pointsPushed = p;	
	}
	
	/*
	 * Gets points pushed
	 * @return float Points pushed
	 */
	public float getPointsPushed() {
		return pointsPushed;
	}
}
