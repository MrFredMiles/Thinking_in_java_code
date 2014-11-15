package Thinking_in_java_code_Chapter8;

class Characteristic1 {
	private String s;
	Characteristic1(String s) {
		this.s = s;
		System.out.println("Creating Characteristic1 " + s);
	}	
}

class Description1 {
	private String s;
	Description1(String s) {
		this.s = s;
		System.out.println("Creating Description1 " + s);
	}
}

class Rodent2 {
	private String name = "Rodent2";
	private Shared1 shared1;
	private static long counter = 0;
	private final long id = counter++; 
	private Characteristic1 c = new Characteristic1("has tail");
	private Description1 d = new Description1("small mammal");
	Rodent2(Shared1 shared1) { 
		System.out.println("Rodent2() " + id); 
		this.shared1 = shared1;
		this.shared1.addRef();
	}
	protected void eat() { System.out.println("Rodent2.eat()"); }
	protected void run() { System.out.println("Rodent2.run()"); }
	protected void sleep() { System.out.println("Rodent2.sleep()"); }
	public String toString() { return name + " " + id; }
}

class Mouse2 extends Rodent2 {
	private String name = "Mouse2";
	private Characteristic1 c = new Characteristic1("likes cheese");
	private Description1 d = new Description1("nocturnal");
	Mouse2(Shared1 shared1) {
		super(shared1); 
		System.out.println("Mouse2()");		
	}
	protected void eat() { System.out.println("Mouse2.eat()"); }
	protected void run() { System.out.println("Mouse2.run()"); }
	protected void sleep() { System.out.println("Mouse2.sleep()"); }
	public String toString() { return name + ", " + super.toString(); }
}

class Rat2 extends Rodent2 {
	private String name = "Rat2";
	private Characteristic1 c = new Characteristic1("larger");
	private Description1 d = new Description1("black");
	Rat2(Shared1 shared1) { 
		super(shared1);
		System.out.println("Rat2()"); 
	}
	protected void eat() { System.out.println("Rat2.eat()"); }
	protected void run() { System.out.println("Rat2.run()"); }
	protected void sleep() { System.out.println("Rat2.sleep()"); }
	public String toString() { return name + ", " + super.toString(); }
}

class Squirrel2 extends Rodent2 {
	private String name = "Squirrel2";
	private Characteristic1 c = new Characteristic1("climbs trees");
	private Description1 d = new Description1("likes nuts");
	Squirrel2(Shared1 shared1) { 
		super(shared1);
		System.out.println("Squirrel2()"); 
	}
	protected void eat() { System.out.println("Squirrel2.eat()"); }
	protected void run() { System.out.println("Squirrel2.run()"); }
	protected void sleep() { System.out.println("Squirrel2.sleep()"); }
	public String toString() { return name + ", " + super.toString(); }
}

public class Code8_14 {
	private static RandomRodent2Generator gen = new RandomRodent2Generator();
	public static void main(String[] args) {
		Rodent2[] Rodent2s = new Rodent2[5];
		for(Rodent2 r : Rodent2s) {
			r = gen.next();
			System.out.println(r);
		}
		gen.shared1.showRefcount();		
	}
}