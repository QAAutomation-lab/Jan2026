package day4.operators;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=25,num2=45;
		System.out.println("num1: "+num1);//25
		System.out.println("num2: "+num2);//45
		System.out.println("*****************************");
		int num3=++num1;//pre-increment
		int num4=num2++;//post-increment
		System.out.println("num1: "+num1);//26
		System.out.println("num2: "+num2);//46
		System.out.println("num3: "+num3);//26
		System.out.println("num4: "+num4);//45
		System.out.println("Program Ends");
	}

}
/*
cond1 && cond2
	*cond1 & cond2 both will give you boolean result
	*if both are true then result will be true
	*if anyone of them is false then final result will be false 

cond1 || cond2
	*cond1 & cond2 both will give you boolean result
	*if both are true then result will be true
	*if anyone of them is true then final result will be true 

*/