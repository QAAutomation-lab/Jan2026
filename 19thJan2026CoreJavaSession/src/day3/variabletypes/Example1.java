package day3.variabletypes;

public class Example1 
{
	//global variables
	static int num1;//static global variable
	int num2;//non-static global variables
	public static void main(String[] args) {
		//Local variable
		int a=10,b=20,c;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		//System.out.println("c= "+c);//compile time error as its value is not initialize
		c=30;
		System.out.println("c= "+c);
	}
}
/*
 * Local variable: variable declared inside method/constructor/block body known as local variable, 
 * 					we don;t use static keyword with local variable
 * 					these variable should be initialize before we use them
 * 					These variable won't get separate memory for storage
 * 					these variable are not accessible from outside the method/constructor body
 * Global Variable: variable declared outside the method/constructor body but present in class body
 * 					known as global variable
 * 		type:
 * 			static global variable: 
 * 			non-static global variable:
 */