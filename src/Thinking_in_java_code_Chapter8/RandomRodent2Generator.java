package Thinking_in_java_code_Chapter8;

import java.util.Random;

 public class RandomRodent2Generator {
	private Random rand = new Random();
	protected Shared1 shared1 = new Shared1();
	public Rodent2 next() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Mouse2(shared1);
			case 1: return new Rat2(shared1);
			case 2: return new Squirrel2(shared1);			
		}
	}
 }