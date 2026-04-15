package day8.methodoverloading;

public class Example3 {

	public static void main(String[] args) {
		Example3 ref=new Example3();
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
	int addition() {
		int num1=25, num2=75;
		int res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}

}
/*
when we declare same method more than once in a class with diff set of parameter/argument that those method will be called as overloaded method
diff set of parameter/argument:
	1. number of parameter should differ or
	2. type of parameter should differ or
	3. position of parameter should differ
NOTE: by changing only return type will not allow you to perform overloading

*/