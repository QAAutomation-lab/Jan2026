package day10.classdia;

public class Example1 {
	int age=25;
	static double salary=50000;
	Example1(){
		System.out.println("I am zero param cons...");
	}
	static void calling(int num) {
		System.out.println("I am calling"+num);
	}
	int getAge() {
		System.out.println("My age is: ");
		return age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
