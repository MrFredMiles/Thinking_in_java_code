package Thinking_in_java_code_Chapter8;
//use the Code8_7.java,RandomInstrumentGenerator.java
public class Code8_8 {
	public static void tune(Instrument1 i) {
		//...
		i.play(Note1.MIDDLE_C);
	}
	public static void tuneAll(Instrument1[] e) {
		for(Instrument1 i : e)
			tune(i);
	}
	private static RandomInstrumentGenerator gen =new RandomInstrumentGenerator();
	
	public static void  main(String[] args) {
		Instrument1[] instra=new Instrument1[20];
		for(int i=0;i<instra.length;i++){
			instra[i]=gen.next();
			
		}
		tuneAll(instra);
		for(Instrument1 i:instra)
			System.out.println(i);
	}
}
