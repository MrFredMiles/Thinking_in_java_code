package Thinking_in_java_code_Chapter5;


class Testers {
	String s;
	{
		s = "Initializing string in Tester";
		System.out.println(s);
	}
	Testers() {
		System.out.println("Testers()");
	}
}

public class Code5_15 {
	public static void main(String[] args) {
		new Testers();				
	}
}