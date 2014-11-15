package Thinking_in_java_code_Chapter8;

public class Code8_6 {
	public static void main(String[] args) {
		Instrument[] orcha={
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};
		tuneAll(orcha);
	}
	public static void tune(Instrument i) {
		i.play(Note.D);
	}
	public static void tuneAll(Instrument[] i) {
		for(Instrument j :i)
			tune(j);
	}
}

class Instrument{
	void play(Note n){
		System.out.println("Instrument.play()"+n);
	}
	public String toString() {
		return "Instrument";
	}
	void adjust(){
		System.out.println("Adjusting Instrument");
	}
}

class Wind extends Instrument{
	void play(Note n){
		System.out.println("Wind.play()"+n);
	}
	public String toString() {
		return "Wind";
	}
	void adjust(){
		System.out.println("Adjusting Wind");
	}
}

class Percussion extends Instrument{
	void play(Note n){
		System.out.println("Percussion.play()"+n);
	}
	public String toString() {
		return "Percussion";
	}
	void adjust(){
		System.out.println("Adjusting Percussion");
	}
}

class Stringed extends Instrument{
	void play(Note n){
		System.out.println("Stringed.play()"+n);
	}
	public String toString() {
		return "Stringed";
	}
	void adjust(){
		System.out.println("Adjusting Stringed");
	}
}

class Brass extends Instrument{
	void play(Note n){
		System.out.println("Brass.play"+n);
	}
	
	void adjust(){
		System.out.println("Adjusting Brass");
	}
}

class Woodwind extends Wind{
	void play(Note n){
		System.out.println("Woodwind.play"+n);
	}
	
	void adjust(){
		System.out.println("Adjusting Woodwind");
	}
}

enum Note {MIDDLE_C, C_SHARP, B_FLAT,D,E,F;}
    

