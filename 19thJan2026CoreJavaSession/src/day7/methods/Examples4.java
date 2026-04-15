package day7.methods;

public class Examples4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//checkEven(5);//it will execute method body,but you won;t get its return value as its store in method
		//System.out.println("is number given even? " +checkEven(5));//method body will be executed and also method return value will be printed
		boolean result=checkEven(5);//method body will be executed but its return value will be stored for future use
		System.out.println("Even number check result: "+result);
		System.out.println("Program Ends");
	}
	static boolean checkEven(int num) {
		System.out.println("Given numeber is: "+num);
		boolean res;
		if(num%2==0) {
			res=true;
		}else {
			res=false;
		}
		return res;
	}
	
}
/*
void: when we don't want to return any value from the method

parameter: when we want to perform some logical operation and for each execution we need diff values

returnType: when you want to perform some logical operation and want to use its result after that

*/