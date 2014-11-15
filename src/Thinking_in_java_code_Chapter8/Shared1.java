package Thinking_in_java_code_Chapter8;

public class Shared1 {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++; 
	public Shared1() { System.out.println("Creating " + this); }
	public void addRef() { refcount++; }
	public String toString() { return "Shared1 " + id; }
	public void showRefcount() { System.out.println("refcount = " + refcount); }		
 }