package day14.pack2;
import day14.pack1.Example1;
public class Demo1 extends Example1{

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example1 ref=new Example1();
		//System.out.println("accessing private variable: "+ref.num1);//compile time error as private members can;t be accessed from outside the class
		//System.out.println("accessing default variable: "+ref.num2);//compile time error as default members are not accessible outside the package
		//System.out.println("accessing protected variable: "+ref.num3);//to access protected member we need inherit require class
		System.out.println("accessing public variable: "+ref.num4);//public can be access
		
		Demo1 d1=new Demo1();
		System.out.println("protected member of class example1, inherited in Demo1"+d1.num3);
		System.out.println("public member of class example1, inherited in Demo1"+d1.num4);
		
		
		Example1 ref2=new Example1();
		System.out.println("Program ends");
	}	

}
