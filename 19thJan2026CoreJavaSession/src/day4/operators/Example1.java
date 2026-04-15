package day4.operators;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=25,num2=45;
		boolean res=(num1==num2);
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("num1 == num2 : "+res);
		System.out.println("num1 == num2 : "+(num1==num2));
		System.out.println("num1 != num2 : "+(num1!=num2));//t
		System.out.println("num1 > num2 : "+(num1>num2));//f
		System.out.println("num1 < num2 : "+(num1<num2));//t
		System.out.println("num1 >= num2 : "+(num1>=num2));//f
		System.out.println("num1 <= num2 : "+(num1<=num2));//t
		System.out.println("Program Ends");
	}

}
