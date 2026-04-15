package day6.loops;

public class Assignments {
	public static void main(String[] args) {
		campute(17, 5);
		swap(25, 5);
		checkLeapYear(2002);
	}
	//Compute Quotient and Remainder
	static void campute(int num1, int num2) {
		int q, r;
		q=num1/num2;
		r=num1%num2;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Quotient: "+q);
		System.out.println("Remainder: "+r);		
	}
	//Swap two numbers using temporary variable
	static void swap(int num1,int num2) {
		System.out.println("Original num1: "+num1);//25
		System.out.println("Original num2: "+num2);//5
		int temp;
		temp=num1;//temp=25
		num1=num2;//num1=5
		num2=temp;//num2=25
		System.out.println("After swapping num1: "+num1);//5
		System.out.println("After swapping num2: "+num2);//25
	}
	/*
	 * Java Program to Check a Leap Year
	 * int year=2000; | 2002
	 * 			(year%4==0 && year%100!=0) || (year%400==0)
	 */
	static void checkLeapYear(int year) {
		
		if((year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println("Given year is leap year");
		}else {
			System.out.println("Given year is not a leap year");
		}
	}
}
/*
Multiply Two Floating-Point Numbers
Find ASCII value of a character
Compute Quotient and Remainder
Swap two numbers using temporary variable

if-else:
	Check whether an alphabet is vowel or consonant using if..else statement
	Find Largest Among three numbers using if..else statement
	Java Program to Check a Leap Year
	

for-loop:
	Display Sum of n Natural Numbers
		int num=5; //1+2+3+4+5
	Display uppercased alphabet using for loop
		A to Z
	Display lowercase alphabet using for loop
		a to z
	Count Number of Digits in an Integer using for loop
		int num=546285;//6
	Reverse a number using a for loop in Java
		int num=123;//321
	Java Program to Check Palindrome number
		int num=121;//palindrome | 123- not a palindrome
	Program to Check Prime Number using a for loop
	Factors of a Positive Integer
	Factors of Negative Number
while-loop:
	Count Number of Digits in an Integer using while loop
	Reverse a Number using a while loop in Java
	Java Program to Check Palindrome Number
	Program to Check Prime Number using a while loop
	Check Armstrong Number for 3 digit number




*/