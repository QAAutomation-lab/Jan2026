package day2.variables;

public class Example5 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//declaration
		int num1;
		int num2;
		int res;
		//initialization
		num1=10;
		num2=20;
		res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
		System.out.println("*********Subs****************");
		//re-initialization
		res=num2-num1;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
		System.out.println("*********Multi****************");
		//re-initialization
		num1=50;
		res=num2*num1;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
		System.out.println("*********Div****************");
		//re-initialization
		num2=25;
		res=num1/num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
		System.out.println("*********Mod****************");
		//re-initialization
		num1=51;
		num2=15;
		res=num1%num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
		System.out.println("Program Ends");
	}
}
/*
Program Starts
variable1 = 10
Program Ends
*/

/*
+ : Addition, when its left and right values are numbers
	10+20=30

+ : Concatenation, when its left or right values are String
	"Pune"+20=Pune20
	"Pune"+10+20="Pune10"+20=Pune1020
	10+20+"Pune"+30+40=30Pune3040
	10+20+"Pune"+(30+40)=30Pune70
*/