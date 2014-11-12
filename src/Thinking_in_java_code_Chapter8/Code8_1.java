package Thinking_in_java_code_Chapter8;

class Cycle {
	private String name = "Cycle";
	public static void travel(Cycle c) {
		System.out.println("Cycle.ride() " + c);
	}
	public String toString() {
		return this.name;
	}
}

class Unicycle extends Cycle {
	private String name = "Unicycle";
	public String toString() {
		return this.name;
	}	
}

class Bicycle extends Cycle {
	private String name = "Bicycle";
	public String toString() {
		return this.name;
	}	

}

class Tricycle extends Cycle {
	private String name = "Tricycle";
	public String toString() {
		return this.name;
	}	
}

public class Code8_1 {
	public static void ride(Cycle c) {
		c.travel(c);
	}
	public static void main(String[] args) {
		Unicycle u = new Unicycle();
		Bicycle b = new Bicycle();
		Tricycle t = new Tricycle();
		ride(u);
		ride(b);
		ride(t);		
	}
}


