package day2.variables;

public class Assignment {

	public static void main(String[] args) {
		double area,pi=3.14;
		int r=10;
		area=pi*r*r;
		System.out.println("r= "+r);
		System.out.println("area= "+area);
		System.out.println("*************************");
		double a,interest=7.5;
		long p=750000;
		int t=5;
		a=(p*interest*t)/100;
		System.out.println("p= "+p);
		System.out.println("interest= "+interest);
		System.out.println("time= "+t);
		System.out.println("a= "+a);
		System.out.println("****************************");
		//c=(f-32)/1.8;
		double c, f=50.0f;
		c=(f-32)/1.8;
		System.out.println("f: "+f);
		System.out.println("c: "+c);
		

	}

}
/*
Write a program to calculate area of circle (exp: area=pi*r*r)
Write a program to calculate area of rectangle
	area=l*w;

Simple interest: A = P*R*T/100
	double A	=	interest amount
	long P	=	initial principal balance
	double r	=	annual interest rate
	int t	=	time (in years)
Write a Java program to convert temperature from Fahrenheit to Celsius degree
	c=((f-32)*5)/9;
*/