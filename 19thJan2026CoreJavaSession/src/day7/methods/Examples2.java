package day7.methods;

public class Examples2 {

	public static void main(String[] args) {
		displayInfo();
		System.out.println("**************");
		Examples2.displayInfo();
		System.out.println("################");
		Examples2.displayInfo();
	}
	public static void displayInfo() {
		System.out.println("Hello");
		System.out.println("Hi");
		System.out.println("Bye");
		System.out.println("Bye");
	}
}
