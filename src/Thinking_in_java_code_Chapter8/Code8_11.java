package Thinking_in_java_code_Chapter8;


class Meal {
	Meal() { System.out.println("Meal()"); } 
}

class Bread {
	Bread() { System.out.println("Bread()"); } 
}

class Cheese {
	Cheese() { System.out.println("Cheese()"); } 
}

class Lettuce {
	Lettuce() { System.out.println("Lettuce()"); } 
}

class Pickle {
	Pickle() { System.out.println("Pickle()"); }
}

class Lunch extends Meal {
	Lunch() { System.out.println("Lunch()"); } 
}

class PortableLunch extends Lunch {
	PortableLunch() { System.out.println("PortableLunch()"); } 
}	

public class Code8_11 extends PortableLunch {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Pickle p = new Pickle();
	private Lunch l = new Lunch();
	public Code8_11() { System.out.println("Sandwich()"); }
	public static void main(String[] args) {
		new Code8_11();
	} 
}