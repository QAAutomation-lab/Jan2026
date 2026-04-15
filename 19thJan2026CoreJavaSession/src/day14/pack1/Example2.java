package day14.pack1;

public class Example2 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example1 ref=new Example1();
		//System.out.println("accessing private variable: "+ref.num1);//compile time error as private members can;t be accessed from outside the class
		System.out.println("accessing default variable: "+ref.num2);
		System.out.println("accessing protected variable: "+ref.num3);
		System.out.println("accessing public variable: "+ref.num4);
		System.out.println("Program ends");
	}

}
/*
private: if any variable or method declare with private keyword then that variable or method can be access 
		 in the particular class, these variable or method can't be access from out side the class

default: anything declare as default, then that can we access up to package level

protected: anything declared as protected, then that can access upto package level even we can access them 
		outside the package only using inheritance

public: anything declare as public can be access from anywhere(make sure that class is also declared as public

*/