package Thinking_in_java_code_Chapter5;

public class Code5_19 {
	public static void main(String[]args) {
		String[] str = new String[10];
		str[0] ="x";
		str[1]="y";
		str[2]="z";
		StringUse s =new StringUse();
		s.f("a","b","c","d");
		s.f(str);
	}
}

class StringUse{
	void f(String...args){
		for(String i :args)
			System.out.println(i);
	}
}