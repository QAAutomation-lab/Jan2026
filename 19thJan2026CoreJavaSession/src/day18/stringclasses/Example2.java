package day18.stringclasses;

public class Example2 {

	public static void main(String[] args) {
		// String object using literals
		String s1="Hello";// will be created in SCP
		System.out.println("s1: "+s1);
		
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


