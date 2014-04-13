/*
 * Class defines user properties and actions between Users
 */
package Core;

public class User {
	
	private String userID;
	private float points = 100;
	private float pointsPushed = 0;
	private boolean ready = false;;
	private boolean playing = true;
	private boolean winner = false;
	
	
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
		this.points = points - p;
		if (p == 0.0f) {
			setIsPlaying(false);
		}
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
	public void setReady(boolean b) {
		this.ready = b;
	}
	
	/*
	 * Sets isPlaying boolean
	 * @param boolean Set false if user folds, true otherwise
	 */
	public void setIsPlaying(boolean b) {
		this.playing = b;
	}
	
	/*
	 * Gets isPlaying boolean
	 * @return boolean True if user hadn't folded, false otherwise
	 */
	public boolean isPlaying() {
		return playing;
	}
	
	/**
	 * Checks to see if user won this round
	 * @return the winner
	 */
	public boolean isWinner() {
		return winner;
	}

	/**
	 * Sets if user wins
	 * @param winner True if won, false otherwise
	 */
	public void setWinner(boolean winner) {
		this.winner = winner;
	}

	/*
	 * Checks to see if a user is ready 
	 */
	public float bet() {
		if (isPlaying() && ready) {
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
