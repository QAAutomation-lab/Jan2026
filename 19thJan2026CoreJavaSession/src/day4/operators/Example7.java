package day4.operators;

public class Example7 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int a=-10,b,c;
		b=a++;//b=-10 |a=-9
		c=++b;//c=-9 |b=-9
		a=c--;//a=-9 |c=-10
		System.out.println("c: "+c);
		System.out.println("b: "+b);
		System.out.println("a: "+a);
		System.out.println("Program Ends");
	}

}

// -10 + 1=-9
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