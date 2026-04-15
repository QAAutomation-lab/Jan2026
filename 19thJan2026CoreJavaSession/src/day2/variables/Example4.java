package day2.variables;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//Syntax to declare & initialize: datatype variablename = value;
		byte variable1=10;//20 | -25 | 100 ....
		short variable2=20;//30 | -25 | 100 ....
		int variable3=30;//20 | -25 | 100 ....
		long variable4=40l;//20 | -25 | 100 ....
		float variable5=50.5f;//20 | -25 | 10.0f ....
		double variable6=60.35d;//20.5 | -25 | 10.0f | 25.3d ....
		char variable7='A';// 'a' | 'F' | 'z' ....
		boolean variable8=true;//false
//		System.out.println("variable1");
//		System.out.println(variable1);
			//or
		System.out.println("variable1 = "+variable1);
		//TODO: print remaining variables
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