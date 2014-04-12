/*
 * Tests methods
 */

package Core;

import java.util.ArrayList;

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
	
	public static void main(String[] args) {
		Tester test = new Tester();
		test.testTable();
	}

}
