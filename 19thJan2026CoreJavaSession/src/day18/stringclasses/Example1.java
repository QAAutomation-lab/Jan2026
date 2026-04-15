package day18.stringclasses;

public class Example1 {

	public static void main(String[] args) {
		// String object using literals
		String s1="Hello";// will be created in SCP
		String s2="Hi";//will be created in SCP
		String s3="Hello";//new object won;t be created, s3 will be pointing to existing object s1
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		// String object using new
		String s4=new String("Bangalore");//two objected will be created. 1. outside of SCP | 2. inside the SCP
		String s5=new String("Hello");//only one object 1. outside of SCP as 2nd object already present in SCP
		System.out.println("s4: "+s4);
		System.out.println("s5: "+s5);
		
		System.out.println("s1==s2 : "+(s1==s2));//compare based on address
		System.out.println("s1==s3 : "+(s1==s3));
		System.out.println("s1==s5 : "+(s1==s5));
		
		System.out.println("s1.equals(s2): "+s1.equals(s2));//compare based on value
		System.out.println("s1.equals(s3): "+s1.equals(s3));
		System.out.println("s1.equals(s5): "+s1.equals(s5));
	}
}
/**
* Outside String class:
* 		== --> compare two values
* 		.equals(obj) --> compare two objects based on there address
* Inside String class:
* 		== --> compare two objects based on address
* 		.equals(obj) --> compare two objects based on value
* toString():
* 		also overried, in String call it will print object value instead of fullyqualifiedclassname
*/


