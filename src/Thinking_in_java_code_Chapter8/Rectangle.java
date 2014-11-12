package Thinking_in_java_code_Chapter8;

public class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Rectangle.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Rectangle.erase()");
	}

	@Override
	public void amend() {
		System.out.println("Rectangle.amend()");
	}
}