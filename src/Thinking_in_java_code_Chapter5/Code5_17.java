package Thinking_in_java_code_Chapter5;

public class Code5_17 {
	public static void  main(String[]args) {
		bStr[] it=new bStr[10];
		//it[0] = new bStr("hahaha"); //delete this "//" to test can init bStr(string)
	}
}

class bStr{
	private String str;
	public bStr() {
		// TODO Auto-generated constructor stub
		str="bStr";
		System.out.println(str);
	}
	bStr(String str){
		this.str=str;
		System.out.println(str);
	}
}
