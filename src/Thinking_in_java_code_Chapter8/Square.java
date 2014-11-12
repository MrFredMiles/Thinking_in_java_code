package Thinking_in_java_code_Chapter8;

public class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Square.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Square.erase()");
	}
	//for ex3
	@Override
	public void amend() {
		System.out.println("Square.amend()");
	}
}