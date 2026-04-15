package day14.pack2;


public class Demo2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//using fully qualified class name: packagename.classname
		day14.pack1.Example1 ref=new day14.pack1.Example1();
		//System.out.println("accessing private variable: "+ref.num1);//compile time error as private members can;t be accessed from outside the class
		//System.out.println("accessing default variable: "+ref.num2);//compile time error as default members are not accessible outside the package
		//System.out.println("accessing protected variable: "+ref.num3);//to access protected member we need inherit require class
		System.out.println("accessing public variable: "+ref.num4);//public can be access
		
		//using fully qualified class name
		day14.pack1.Example1 ref2=new day14.pack1.Example1();
	}	

}
