package Thinking_in_java_code_Chapter5;

public class Code5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two two=new Two();
		two.print();
	}

}

class Two{
	static String oneStr;
	static String twoStr;
	public Two() {
		// TODO Auto-generated constructor stub
		oneStr = "sss";
		System.out.println("oneStr initial");
	}
	static{
		twoStr="ttt";
		System.out.println("twoStr initial");
	}
	public void print() {
		System.out.println("one is "+oneStr);
		System.out.println("two is "+twoStr);
		
	}
}