package day11.inheritances;
class Example1{
	//default constructor
	static int num1=25;
	void calling() {
		System.out.println("I am calling from Example1");
	}
}
class Example2{
	//default constructor
	static int num2=50;
	void display() {
		System.out.println("I am display from Example2");
	}
}
public class Sample1 {
	//default constructor
	static void calling(int num) {
		System.out.println("I am calling"+num);
	}
	void getAge() {
		System.out.println("My age is 20 ");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("*************Example1 class members***************");
		System.out.println("Example1 class SGV num1: "+Example1.num1);
		Example1 ref=new Example1();
		ref.calling();
		System.out.println("*************Example2 class members***************");
		System.out.println("Example2 class SGV num2: "+Example2.num2);
		Example2 ref2=new Example2();
		ref2.display();
		System.out.println("***********Sample1 class members**************");
		Sample1.calling(10);
		Sample1 ref3=new Sample1();
		ref3.getAge();
		System.out.println("Program ends");
	}
}
