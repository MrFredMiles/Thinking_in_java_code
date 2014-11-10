package Thinking_in_java_code_Chapter5;


class Doc {	
	void intubate() {
		System.out.println("prepare patient");
		laryngoscopy();
		this.laryngoscopy();	
	}
	void laryngoscopy() {
		System.out.println("use laryngoscope");
	}	
}	
public class Code5_8{	
	public static void main(String[] args) {
		new Doc().intubate();		
	}		
}