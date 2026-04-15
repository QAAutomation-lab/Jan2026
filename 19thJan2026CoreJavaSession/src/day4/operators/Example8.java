package day4.operators;

public class Example8 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int a=5,b,c;
		   b= a + ++a + a++ + ++a + --a + a + a--;
//initial(b)= 5 + 6   + 6   +  8  +  7  + 7 + 7 =46
//final(a)  = 5   6     7      8    7     7   6
		   System.out.println("b: "+b);
		   System.out.println("a: "+a);
		   c= b++ + ++b + b + b-- + b-- + --b;
//initial(c)= 46  + 48  +48 + 48  + 47  + 45
//final(b)  = 47    48   48   47    46    45
		System.out.println("c: "+c);
		System.out.println("b: "+b);
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