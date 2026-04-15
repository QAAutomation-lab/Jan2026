package day6.loops;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("********Print 0 to 5*******");
		int i=0;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		System.out.println("********Print 5 to 0******");
		i=5;
		while(i>=0) {
			System.out.println(i);
			i--;
		}
		System.out.println("*******Print even number between 1 to 20******");
		int num=1;
		while(num<=20) {
			if(num%2==0) {
				System.out.println("Given number is even: "+num);
			}
			num++;
		}
	}
}