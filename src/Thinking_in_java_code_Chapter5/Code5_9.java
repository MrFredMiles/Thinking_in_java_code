package Thinking_in_java_code_Chapter5;

class Docu {
	Docu(int i) {
		this("MD");
		int yearsTraining = i;
		System.out.println("New doc with " + i + " years of training");
	}
	Docu(String s) {
		String degree = s;
		System.out.println("New doc with " + s + " degree");
	}	
	void intubate() {
		System.out.println("prepare patient");
		laryngoscopy();
	}
	void laryngoscopy() {
		System.out.println("use laryngoscope");
	}	
}
	
public class Code5_9 {	
	public static void main(String[] args) {
		new Docu(8).intubate();		
	}		
}
