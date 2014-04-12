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
	
	public static void main(String[] args) {
		Tester test = new Tester();
		test.testUser();
	}

}
