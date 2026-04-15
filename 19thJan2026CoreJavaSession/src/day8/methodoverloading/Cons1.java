package day8.methodoverloading;

public class Cons1 {
	int num1=25, num2;
	//default constructor
//	Cons1(){
//			will be written by java compiler
//	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Cons1 ref=new Cons1();
		System.out.println("num1: "+ref.num1 );
		System.out.println("num2: "+ref.num2 );
		System.out.println("Program ends");
	}
}
