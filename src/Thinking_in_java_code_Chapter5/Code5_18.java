package Thinking_in_java_code_Chapter5;

public class Code5_18 {
	public static void  main(String[]args) {
		bStr2[] it=new bStr2[10];
		for(int i=0;i<it.length;i++)
			it[i]=new bStr2(Integer.toString(i));	
	}
}
class bStr2{
	private String str;
	public bStr2() {
		// TODO Auto-generated constructor stub
		str="bStr";
		System.out.println(str);
	}
	bStr2(String str){
		this.str=str;
		System.out.println(str);
	}
}