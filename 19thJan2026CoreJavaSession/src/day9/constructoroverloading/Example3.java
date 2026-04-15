package day9.constructoroverloading;

public class Example3 {
	int num1;
	double num2;
	
	Example3(){
		System.out.println("I am zero-param cons..");	
	}
	void display() {
		System.out.println("I am display with zero param");
		System.out.println("global num1: "+num1);
		System.out.println("global num2: "+num2);
	}
	void display(int num1, double num2) {
		System.out.println("I am display with int-double param");
		System.out.println("local num1: "+num1);
		System.out.println("local num2: "+num2);
//		Example2 e1=new Example2();
//		System.out.println("global num1: "+e1.num1);
//		System.out.println("global num2: "+e1.num2);
				//or
		System.out.println("global num1: "+this.num1);
		System.out.println("global num2: "+this.num2);
		System.out.println("****************************");
		num1=this.num1;//storing global variable value into local variable
		this.num2=num2;//storing local variable value into global variable
		System.out.println("local num1: "+num1);//0
		System.out.println("local num2: "+num2);//30.52
		System.out.println("global num1: "+this.num1);//0
		System.out.println("global num2: "+this.num2);//30.52
		
		//display();//or
		this.display();
	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example3 ref3=new Example3();
		ref3.display(25, 30.52);
		System.out.println("Program Starts");
	}
}
/*
this keyword: its an instance of current class, 
	this can be used inside non-static method or constructor only
	mainly used to differentiate non-static method local variable with global variable when they have same name
	using this keyword you call another non-static method/variable

*/