package day9.constructoroverloading;

public class Example7 {
	int num1;
	double num2;
	Example7(){
		this(36.9);
		System.out.println("I am zero -param cons..");
	}
	Example7(int x){
		this();
		System.out.println("I am int-param cons..");
		num1=x;
	}
	Example7(double x){
		System.out.println("I am double-param cons..");
		num2=x;
	}
	Example7(int x,double y){
		this(20);
		System.out.println("I am int-double-param cons..");
		num1=x;
		num2=y;
	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
//		Example7 ref1=new Example7();
//		Example7 ref2=new Example7(20);
//		Example7 ref3=new Example7(36.54);
		Example7 ref4=new Example7(50,80.36);		
		System.out.println("Program Starts");
	}
}
/*
 * double
 * zero
 * int
 * int-double
 * 
this()
	this statement is used to call another constructor of current class based on the parameter
	this statement should be the 1st statement inside the constructor
	this statement can be used only inside constructor
*/