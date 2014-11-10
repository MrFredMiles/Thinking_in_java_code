package Thinking_in_java_code_Chapter5;


class Kabayo2 {
	Kabayo2() {
		System.out.println("isa lang kabayo");
	}
	Kabayo2(String s) {
		System.out.println(s);
	}	
} 

public class Code5_4 {
	public static void main(String[] args) {
		Kabayo2 k = new Kabayo2();
		Kabayo2 k2 = new Kabayo2("tumutugtog ng gitara");
	}
}
