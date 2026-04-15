package day8.methodoverloading;

public class Example2 {

	public static void main(String[] args) {
		Example2 ref=new Example2();
		ref.addition();
		ref.addition(50.5f,20);
	}
	/*
	 * diff set of parameter/argument:
		1. number of parameter should differ or
		2. type of parameter should differ or
		3. position of parameter should differ
	 */
	void addition() {
		int num1=10, num2=20, res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}
	void addition(int num1, int num2) {
		int res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}
	void addition(float num1, int num2) {
		double res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}
	void addition(int num1, float num2) {
		double res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}
	void addition(double num3,int num1, float num2) {
		double res=num1+num2+num3;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Number3: "+num3);
		System.out.println("Result: "+res);
	}

}
/*
when we declare same method more than once in a class with diff set of parameter/argument that those method will be called as overloaded method
diff set of parameter/argument:
	1. number of parameter should differ or
	2. type of parameter should differ or
	3. position of parameter should differ
	

*/