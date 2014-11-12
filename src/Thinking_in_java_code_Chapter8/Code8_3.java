package Thinking_in_java_code_Chapter8;

import java.util.Random;
import Thinking_in_java_code_Chapter8.Shape;
import Thinking_in_java_code_Chapter8.Circle;
import Thinking_in_java_code_Chapter8.Square;
import Thinking_in_java_code_Chapter8.Triangle;
import Thinking_in_java_code_Chapter8.RandomShapeGenerator;

public class Code8_3{
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String[] args) {
		Shape[] s = new Shape[10];
		// fill up the array wth shapes:
		for(int i = 0; i < s.length; i++)
			s[i] = gen.next();
		// make polymorphic method calls:
		for(Shape shp : s) {
			shp.draw();
			shp.amend();
		}	
	}
}