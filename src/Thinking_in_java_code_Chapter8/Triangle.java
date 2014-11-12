package Thinking_in_java_code_Chapter8;

public class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Triangle.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Triangle.erase()");
	}
	//for ex3
	@Override
	public void amend() {
		System.out.println("Triangle.amend()");
	}
}
