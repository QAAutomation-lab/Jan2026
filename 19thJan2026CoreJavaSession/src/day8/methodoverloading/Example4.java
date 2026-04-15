package day8.methodoverloading;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		main();
		System.out.println("Program ends");
	}
	public static void main() {
		System.out.println("I am overloaded main()..");
	}
	/*
	 * diff set of parameter/argument:
		1. number of parameter should differ or
		2. type of parameter should differ or
		3. position of parameter should differ
	 */
}
/*
when we declare same method more than once in a class with diff set of parameter/argument that those method will be called as overloaded method
diff set of parameter/argument:
	1. number of parameter should differ or
	2. type of parameter should differ or
	3. position of parameter should differ
	

*/