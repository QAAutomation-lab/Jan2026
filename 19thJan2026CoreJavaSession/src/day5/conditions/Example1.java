package day5.conditions;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int num=10;
		if(num>=0) {
			System.out.println("Given number is positive");
		}else {
			System.out.println("Given number is negative");
		}
		System.out.println("**************************");
		int age=18;
		if(age>=18) {
			System.out.println("Welcome, you can donate your blood");
		}else {
			System.out.println("Sorry, you are not allowed to donate blood");
		}
		System.out.println("******************");
		int x=30;
		if(x==30) {
			System.out.println("Given number matched");
		}else {
			System.out.println("Not matched");
		}
		System.out.println("Program ends");
	}

}
