package Thinking_in_java_code_Chapter8;


class Characteristic {
	private String s;
	Characteristic(String s) {
		this.s = s;
		System.out.println("Creating Characteristic " + s);
	}	
}

class Description {
	private String s;
	Description(String s) {
		this.s = s;
		System.out.println("Creating Description " + s);
	}
}

class Rodent1 {
	private String name = "Rodent1";
	private Characteristic c = new Characteristic("has tail");
	private Description d = new Description("small mammal");
	Rodent1() { System.out.println("Rodent1()"); }
	protected void eat() { System.out.println("Rodent1.eat()"); }
	protected void run() { System.out.println("Rodent1.run()"); }
	protected void sleep() { System.out.println("Rodent1.sleep()"); }
	public String toString() { return name; }
}

class Mouse1 extends Rodent1 {
	private String name = "Mouse1";
	private Characteristic c = new Characteristic("likes cheese");
	private Description d = new Description("nocturnal");
	Mouse1() { System.out.println("Mouse1()"); }
	protected void eat() { System.out.println("Mouse1.eat()"); }
	protected void run() { System.out.println("Mouse1.run()"); }
	protected void sleep() { System.out.println("Mouse1.sleep()"); }
	public String toString() { return name; }
}

class Rat1 extends Rodent1 {
	private String name = "Rat1";
	private Characteristic c = new Characteristic("larger");
	private Description d = new Description("black");
	Rat1() { System.out.println("Rat1()"); }
	protected void eat() { System.out.println("Rat1.eat()"); }
	protected void run() { System.out.println("Rat1.run()"); }
	protected void sleep() { System.out.println("Rat1.sleep()"); }
	public String toString() { return name; }
}

class Squirrel1 extends Rodent1 {
	private String name = "Squirrel1";
	private Characteristic c = new Characteristic("climbs trees");
	private Description d = new Description("likes nuts");
	Squirrel1() { System.out.println("Squirrel1()"); }
	protected void eat() { System.out.println("Squirrel1.eat()"); }
	protected void run() { System.out.println("Squirrel1.run()"); }
	protected void sleep() { System.out.println("Squirrel1.sleep()"); }
	public String toString() { return name; }
}

public class Code8_12 {
	private static RandomRodent1Generator gen = new RandomRodent1Generator();
	public static void main(String[] args) {
		Rodent1[] Rodent1s = new Rodent1[10];
		for(Rodent1 r : Rodent1s) {
			r = gen.next();
			System.out.println(r);
		}		
	}
}