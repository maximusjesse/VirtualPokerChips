package Core;
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

}