package day9.constructoroverloading;

public class Example5 {
	int num1;
	double num2;
	Example5(){
		System.out.println("I am zero -param cons..");
	}
	Example5(int x){
		System.out.println("I am int-param cons..");
		num1=x;
	}
	Example5(double x){
		System.out.println("I am double-param cons..");
		num2=x;
	}
	Example5(int x,double y){
		System.out.println("I am int-double-param cons..");
		num1=x;
		num2=y;
	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example5 ref1=new Example5();
		Example5 ref2=new Example5(20);
		Example5 ref3=new Example5(36.54);
		Example5 ref4=new Example5(50,80.36);		
		System.out.println("Program Starts");
	}

}
