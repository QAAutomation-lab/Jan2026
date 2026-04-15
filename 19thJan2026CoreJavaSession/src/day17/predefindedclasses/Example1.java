package day17.predefindedclasses;

public class Example1{
	void calling() {
		System.out.println("I am calling you");
	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example1 ref1=new Example1();
		Example1 ref2=new Example1();
		System.out.println("ref1: "+ref1.toString());//explicit call for toString() ---> public and String as return type
		System.out.println("ref2: "+ref2);//implicit call for toString()
		System.out.println("ref1 address from hex in decimal: "+ref1.hashCode());//public and return type as int
		System.out.println("ref2 address from hex in decimal: "+ref2.hashCode());//public and return type as int
		System.out.println("ref1 equals to ref2? "+ref1.equals(ref2));//public and return type as boolean
		
		Example1 ref3=ref1;
		System.out.println("ref3: "+ref3);
		System.out.println("ref3 address from hex in decimal: "+ref3.hashCode());//public and return type as int
		System.out.println("ref1 equals to ref3? "+ref1.equals(ref3));//public and return type as boolean
		System.out.println("Program Ends");
	}

}
/*
Object class is supermost class in java belongs to java.lang package
this package by default available in all java classes hence no need to write explicitly

*/