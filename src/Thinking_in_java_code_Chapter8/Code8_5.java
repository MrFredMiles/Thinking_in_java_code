package Thinking_in_java_code_Chapter8;

class Cycle1 {
	private String name = "Cycle";
	private int wheels = 0;
	public static void travel(Cycle1 c) {
		System.out.println("Cycle.ride() " + c);
	}
	public int wheels() { return wheels; }
	public String toString() {
		return this.name;
	}
}

class Unicycle1 extends Cycle1 {
	private String name = "Unicycle";
	private int wheels = 1;
	@Override public int wheels() { return wheels; }
	public String toString() {
		return this.name;
	}	
}

class Bicycle1 extends Cycle1 {
	private String name = "Bicycle";
	private int wheels = 2;
	@Override public int wheels() { return wheels; }
	public String toString() {
		return this.name;
	}	

}

class Tricycle1 extends Cycle1 {
	private String name = "Tricycle";
	private int wheels = 3;
	@Override public int wheels() { return wheels; }
	public String toString() {
		return this.name;
	}	
}

public class Code8_5 {
	public static void ride(Cycle1 c) {
		c.travel(c);
		System.out.println("wheels: " + c.wheels());
	}
	public static void main(String[] args) {
		Unicycle1 u = new Unicycle1();
		Bicycle1 b = new Bicycle1();
		Tricycle1 t = new Tricycle1();
		ride(u); // upcast to Cycle
		ride(b);
		ride(t);		
	}
}

