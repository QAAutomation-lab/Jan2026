package day7.methods;

public class Assignments {
	public static void main(String[] args) {
		campute(17, 5);
		swap(25, 5);
		checkLeapYear(2002);
		System.out.println("Sum:" +sumOfNaturalNum(15));
		
		System.out.println("Reverse num: "+getReverseNum(1245));
		System.out.println("Is given number palindrome?: "+checkPalin(1221));
		
		System.out.println("Digit count: "+getDigitCount(100050));
	}
	//Count Number of Digits in an Integer using for loop
	static int getDigitCount(int num) {
		System.out.println("Given number is: "+num);
		int ct=0;
		for(;num!=0;num=num/10) {
				ct++;
		}
		return ct;
	}
	//Reverse a number using a for loop in Java
	static int getReverseNum(int num) {
		System.out.println("Origonal number: "+num);
		int rev=0,rem=0;
		for(;num!=0;num=num/10) {
			rem=num%10;
			rev=rev*10+rem;
		}
		return rev;
	}
	
	static boolean checkPalin(int num) {
		System.out.println("Origonal number: "+num);
		int temp=num,rev=0,rem=0;
		for(;num!=0;num=num/10) {
			rem=num%10;
			rev=rev*10+rem;
		}
		if(rev==temp) {
			return true;
		}else {
			return false;
		}
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
	static int sumOfNaturalNum(int num) {//5
		System.out.println("Natural Number: "+num);
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;//0+1|1+2|3+3|6+4|10+5
		}
		return sum;
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