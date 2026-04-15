package day4.operators;

public class Example5 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=25,num2=45;
		 
		System.out.println("num1: "+num1);//25
		System.out.println("num2: "+num2);//45
		System.out.println("updated num1: "+ ++num1);//26
		System.out.println("num2: "+ num2++);//45
		System.out.println("updated num2: "+ num2);//45
		System.out.println("Program Ends");
	}

}
/*
pre: first perform the operation(increment/decrement) dn use the values
	int num1=25;
	int x=++num1;// num1=num1+1
	System.out.println(num1);//26
	System.out.println(x);//26
	
	int num1=25;
	int x=--num1;// num1=num1-1;
	System.out.println(num1);//24
	System.out.println(x);//24
post: first use the value dn perform the operation(increment/decrement)\
	int num1=25;
	int x=num1++;// num1=num1+1
	System.out.println(num1);//26
	System.out.println(x);//25
	
	int num1=25;
	int x=num1--;// num1=num1-1;
	System.out.println(num1);//24
	System.out.println(x);//25
*/