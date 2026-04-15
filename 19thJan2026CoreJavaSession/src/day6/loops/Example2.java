package day6.loops;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("********Print 0 to 5*******");
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("********Print 5 to 0******");
		for(int i=5;i>=0;i--) {
			System.out.println(i);
		}
		System.out.println("*******Print even number between 1 to 20******");
		for(int num=1;num<=20;num++) {
			if(num%2==0) {
				System.out.println("Given number is even "+num);
			}
		}
	}
}