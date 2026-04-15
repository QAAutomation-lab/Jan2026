package day8.methodoverloading;

public class Cons2 {
	int num1=25, num2;
	//user defined constructor
	Cons2(){
			System.out.println("I am user defined zero-param cons ");
	}
	Cons2(int num){
		System.out.println("I am user defined zero-param cons ");
	}	
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Cons2 ref=new Cons2();
		System.out.println("num1: "+ref.num1 );
		System.out.println("num2: "+ref.num2 );
		System.out.println("Program ends");
	}
}
