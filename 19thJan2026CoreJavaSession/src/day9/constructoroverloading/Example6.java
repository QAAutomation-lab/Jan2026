package day9.constructoroverloading;

public class Example6 {
	int num1;
	double num2;
	Example6(){
		this(10);//this will call another constructor of Example6 class having int type parameter
		System.out.println("I am zero -param cons..");
	}
	Example6(int x){
		this(95.86);
		System.out.println("I am int-param cons..");
		num1=x;
	}
	Example6(double x){
		this(70,36.52);
		System.out.println("I am double-param cons..");
		num2=x;
	}
	Example6(int x,double y){
		System.out.println("I am int-double-param cons..");
		num1=x;
		num2=y;
	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example6 ref1=new Example6();
//		Example6 ref2=new Example6(20);
//		Example6 ref3=new Example6(36.54);
//		Example6 ref4=new Example6(50,80.36);		
		System.out.println("Program Starts");
	}
}
/*
this()
	this statement is used to call another constructor of current class based on the parameter
	this statement should be the 1st statement inside the constructor
	this statement can be used only inside constructor
*/