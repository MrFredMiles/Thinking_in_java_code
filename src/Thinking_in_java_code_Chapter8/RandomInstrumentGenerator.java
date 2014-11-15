package Thinking_in_java_code_Chapter8;

import java.util.Random;

public class RandomInstrumentGenerator {
		private Random rand = new Random();
		public Instrument1 next() {
			switch(rand.nextInt(7)) {
				default:
				case 0: return new Wind1();
				case 1: return new Percussion1();
				case 2: return new Stringed1();
				case 3: return new Keyboard();
				case 4: return new Brass1();
				case 5: return new WoodWind1();
				case 6: return new Piano();
			}
		}
}
