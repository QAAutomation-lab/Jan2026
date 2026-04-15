package day9.constructoroverloading;

public class Example4 {
	static int num1;
	static double num2;
	static void display() {
		System.out.println("I am display with zero param");
		System.out.println("global num1: "+num1);
		System.out.println("global num2: "+num2);
	}
	static void display(int num1, double num2) {
		System.out.println("I am display with int-double param");
		System.out.println("local num1: "+num1);
		System.out.println("local num2: "+num2);
		System.out.println("global num1: "+Example4.num1);
		System.out.println("global num2: "+Example4.num2);
		
		//display();//or
		Example4.display();
	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
		display(10, 50.36);
		System.out.println("Program Starts");
	}
}
/*
this keyword: its an instance of current class, 
	this can be used inside non-static method or constructor only
	mainly used to differentiate non-static method local variable with global variable when they have same name
	using this keyword you call another non-static method/variable

*/