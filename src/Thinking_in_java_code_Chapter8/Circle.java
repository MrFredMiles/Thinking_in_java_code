package Thinking_in_java_code_Chapter8;

public class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Circle.erase()");
	}
	//for ex3
	@Override
	public void amend() {
		System.out.println("Circle.amend()");
	}
}