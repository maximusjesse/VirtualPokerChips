/*
 * Tests methods
 */

package Core;

public class Tester {
	
	public void testUser() {
		User a = new User("A");
		System.out.println(a.toString());
		//System.out.println(b.toString());
	}
	
	public void testTable() {
		MasterUser master = new MasterUser("Test Master zzzzzzzzzzz");
		Table testTable = new Table(master);
		User a = new User("A");
		User b = new User("B");
		User c = new User("C", 109182391823.1231239283f);
		testTable.addUser(a);
		testTable.addUser(b);
		testTable.addUser(c);
		System.out.println(testTable.scoreboard());
		
	}
	
	public void testRound() {
		MasterUser master = new MasterUser("Master User", 100);
		Table testTable = new Table(master);
		User a = new User("A");
		User b = new User("B");
		User c = new User("C");
		testTable.addUser(a);
		testTable.addUser(b);
		testTable.addUser(c);
		System.out.println(testTable.scoreboard());
		a.setPointsPushed(10.0f);
		b.setPointsPushed(20.0f);
		c.setPointsPushed(0.0f);
		a.setReady(true);
		b.setReady(true);
		c.setReady(true);
		System.out.println(a.isPlaying());
		System.out.println(b.isPlaying());
		System.out.println(c.isPlaying());
		Table.jackpot.toString();
		testTable.playARound();
		
	}
	
	public static void main(String[] args) {
		Tester test = new Tester();
		test.testRound();
	}

}
