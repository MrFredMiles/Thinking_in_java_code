package Thinking_in_java_code_Chapter5;


public class Code5_21 {
	public enum Bills {
		ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
	}
	public static void main(String[] args) {
		for(Bills b : Bills.values())
			System.out.println(b + ", ordinal " + b.ordinal());	
	}	
}
