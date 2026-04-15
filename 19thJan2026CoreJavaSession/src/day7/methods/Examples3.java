package day7.methods;

public class Examples3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		addition();
		System.out.println("*****************");
		addition();
		System.out.println("-------------------------");
		additionOfNum(50, 70);
		System.out.println("*****************");
		additionOfNum(60, 50);
		System.out.println("-------------------------");
		additionOfNums(25.6f, 10);
		System.out.println("Program Ends");
	}
	static void addition() {
		int num1=10,num2=20,res=num1+num2;
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		System.out.println("res: "+res);
	}
	static void additionOfNum(int num1, int num2) {// num1=50 | num2=70
		int res=num1+num2;
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		System.out.println("res: "+res);
	}
	static void additionOfNums(float num1, int num2) {// num1=50 | num2=70
		float res=num1+num2;
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		System.out.println("res: "+res);
	}
}
/*
void: when we don't want to return any value from the method

parameter: when we want to perform some logical operation and for each execution we need diff values



*/