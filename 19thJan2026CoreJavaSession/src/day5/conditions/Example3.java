package day5.conditions;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int age=18;
		char bldGrp='B';
		if(age>=18) {
			System.out.println("Welcome, you can go a head for blood sample check");
			if(bldGrp=='A') {
				System.out.println("Yes, you can donate your blood");
			}else {
				System.out.println("Sorry, your blood group doesn;t matched");
			}
		}else {
			System.out.println("Sorry, you are not eligible for blood donation");
		}
		
		System.out.println("Program ends");
	}

}
