package day2.variables;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//Syntax to declare: datatype variablename;
		byte variable1;
		short variable2;
		int variable3;
		long variable4;
		float variable5;
		double variable6;
		char variable7;
		boolean variable8;
		//Syntax to initlize: variablename = value;
		variable1=10;//20 | -25 | 100 ....
		variable2=20;//30 | -25 | 100 ....
		variable3=30;//20 | -25 | 100 ....
		variable4=40l;//20 | -25 | 100 ....
		variable5=50.5f;//20 | -25 | 10.0f ....
		variable6=60.35d;//20.5 | -25 | 10.0f | 25.3d ....
		variable7='A';// 'a' | 'F' | 'z' ....
		variable8=true;//false
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