package Thinking_in_java_code_Chapter8;

public class Code8_7 {
	public static void main(String[] args) {
		Instrument1[] orcha={
				new Wind1(),
				new Percussion1(),
				new Stringed1(),
				new Brass1(),
				new WoodWind1(),
				new Piano()
		};
		tuneAll(orcha);
	}
	public static void tune(Instrument1 i) {
		i.play(Note1.D);
	}
	public static void tuneAll(Instrument1[] i) {
		for(Instrument1 j :i)
			tune(j);
	}
}

class Instrument1{
	void play(Note1 n){
		System.out.println("Instrument1.play()"+n);
	}
	public String toString() {
		return "Instrument1";
	}
	void adjust(){
		System.out.println("Adjusting Instrument1");
	}
}

class Wind1 extends Instrument1{
	void play(Note1 n){
		System.out.println("Wind1.play()"+n);
	}
	public String toString() {
		return "Wind1";
	}
	void adjust(){
		System.out.println("Adjusting Wind1");
	}
}

class Percussion1 extends Instrument1{
	void play(Note1 n){
		System.out.println("Percussion1.play()"+n);
	}
	public String toString() {
		return "Percussion1";
	}
	void adjust(){
		System.out.println("Adjusting Percussion1");
	}
}

class Stringed1 extends Instrument1{
	void play(Note1 n){
		System.out.println("Stringed1.play()"+n);
	}
	public String toString() {
		return "Stringed1";
	}
	void adjust(){
		System.out.println("Adjusting Stringed1");
	}
}

class Brass1 extends Instrument1{
	void play(Note1 n){
		System.out.println("Brass1.play"+n);
	}
	
	void adjust(){
		System.out.println("Adjusting Brass1");
	}
}

class Keyboard extends Instrument1 {
	void play(Note n) { System.out.println("Keyboard.play() " + n); }
	public String toString() { return "Keyboard"; }
	void adjust() { System.out.println("Adjusting Keyboard"); } 
}

class WoodWind1 extends Wind1{
	void play(Note1 n){
		System.out.println("WoodWind1.play"+n);
	}
	
	void adjust(){
		System.out.println("Adjusting WoodWind1");
	}
}

class Piano extends Keyboard {
	void play(Note n) { System.out.println("Piano.play() " + n); }
	public String toString() { return "Piano"; }// the difference
}

enum Note1 {MIDDLE_C, C_SHARP, B_FLAT,D,E,F;}