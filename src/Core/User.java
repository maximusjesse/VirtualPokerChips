/*
 * Class defines user properties and actions between Users
 */
package Core;

public class User {
	
	private String userID;
	private float points, pointsPushed = 0;
	private boolean isReady;
	private boolean isPlaying;
	
	
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
	 * Sets isReady boolean
	 * @param boolean True if user clicks ready button, false otherwise
	 */
	public void setIsReady(boolean b) {
		isReady = b;
	}
	
	/*
	 * Sets isPlaying boolean
	 * @param boolean Set false if user folds, true otherwise
	 */
	public void setIsPlaying(boolean b) {
		this.isPlaying = b;
	}
	
	/*
	 * Gets isPlaying boolean
	 * @return boolean True if user hadn't folded, false otherwise
	 */
	public boolean getIsPlaying() {
		return isPlaying;
	}
	
	/*
	 * Checks to see if a user is ready 
	 */
	public float bet() {
		if (isReady) {
			Table.jackpot.setPoints(Table.jackpot.getPoints() + getPointsPushed());
		}
		return pointsPushed;
	}

	/*
	 * toString method for user id and points
	 * @return String toString()
	 */
	public String toString() {
		if (userID.length() > 20) {
			return String.format("%-20s%.2f", userID.substring(0, 19), points);
		}
		return String.format("%-20s%.2f", userID, points);
	}
	
}
