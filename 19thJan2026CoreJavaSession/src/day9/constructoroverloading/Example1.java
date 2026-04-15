package day9.constructoroverloading;

public class Example1 {
	int num1;
	double num2;
	Example1(){
		System.out.println("I am zero -param cons..");
	}
	Example1(int x){
		System.out.println("I am int-param cons..");
		num1=x;
	}
	Example1(double x){
		System.out.println("I am double-param cons..");
		num2=x;
	}
	Example1(int x,double y){
		System.out.println("I am int-double-param cons..");
		num1=x;
		num2=y;
	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example1 ref1=new Example1();
		System.out.println("num1 with ref1: "+ref1.num1);
		System.out.println("num2 with ref1: "+ref1.num2);
		System.out.println("*************************");
		Example1 ref2=new Example1(25.36);
		System.out.println("num1 wih ref2: "+ref2.num1);//0
		System.out.println("num2 with ref2: "+ref2.num2);//25.36
		System.out.println("*************************");
		Example1 ref3=new Example1(10,25.36);
		System.out.println("num1 wih ref3: "+ref3.num1);//10
		System.out.println("num2 with ref3: "+ref3.num2);//25.36
		System.out.println("*************************");
		Example1 ref4=new Example1(10);
		System.out.println("num1 wih ref4: "+ref4.num1);//10
		System.out.println("num2 with ref4: "+ref4.num2);//0.0
		System.out.println("Program Starts");
	}

}
