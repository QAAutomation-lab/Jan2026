package day2.variables;

public class Example1 {

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
		System.out.println("Program Ends");
	}

}
/*
variable points to the memory location where we can store value based on the data type and whenever we want, we can change its value hence its known as variable.

Syntax to declare: datatype variablename;

Syntax to initlize: variablename = value;

Syntax to declare and initlize: datatype variablename = value;

where:
   datatype------> tells us what type of value this variable is going to hold
	types---- > Primitive and non-primitive type
			Primitive Types:
			byte, short, int, long --> positive or negative number
			float, double          --> decimal numbers
			char                   --> character/alphabet 
			boolean                --> true/false
   
   variablename -> valid identifier
   
   value --------> literals ->data will be store in variable based on datatype
					Numeric  --> Integer & Floating point
					Boolean
					Character
					String

*/