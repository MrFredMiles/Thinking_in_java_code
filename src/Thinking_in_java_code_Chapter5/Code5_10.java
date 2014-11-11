package Thinking_in_java_code_Chapter5;


class WebBank {
	boolean loggedIn = false;
	WebBank(boolean logStatus) {
		loggedIn = logStatus;
	}
	void logIn() {
		loggedIn = true;
	}
	void logOut() {
		loggedIn = false;
	}
	protected void finalize() {
		if(loggedIn)
			System.out.println("Error: still logged in");
		// Normally, you'll also do this:
		// super.finalize(); // Call the base-class version
	}
}

public class Code5_10 {
	public static void main(String[] args) {
		WebBank bank1 = new WebBank(true);
		WebBank bank2 = new WebBank(true);
		// Proper cleanup: log out of bank1 before going home
		bank1.logOut();
		// forget to logout:
		bank2.logIn();
		// Force garbage collection and finalization:
		System.gc();
	}	
}