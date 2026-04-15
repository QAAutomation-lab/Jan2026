package day17.predefindedclasses;
class Demo101 {
	void display() {
		System.out.println("Demo class display method");
	}
	void display(int num) {
		System.out.println("Demo class callMe method");//
	}
	Demo101() {
		System.out.println("Demo class cons..");
	}
}
public final class StaticReference {
	static void testing() {
		System.out.println("I am testing method of staticreference class");
	}
	static Demo101 k1=new Demo101();
	public static void main(String[] args) {
		System.out.println("########################");
   //classname.staticRef.nonstaticMethodOfDemoClass		
		StaticReference.k1.display();
		StaticReference.k1.display(456);
		System.out.println("******************************");
		// access Demo class non-static member
		Demo101 d1=new Demo101();
		d1.display();
		d1.display(123);		
		StaticReference.testing();
		
		System.err.println("I am written using err");
	}
}
