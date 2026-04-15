package day17.predefindedclasses;

import java.util.Scanner;

public class ScannerExample1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1, num2, sum;
//		num1=10;
//		num2=20;
		//create instance of Scanner class
		Scanner ref=new Scanner(System.in);
		System.out.println("-------------- Enter num1 values --------------");
		num1=ref.nextInt();
		System.out.println("-------------- Enter num2 values --------------");
		num2=ref.nextInt();
		sum=num1+num2;
		System.out.println("Number1 : "+num1);
		System.out.println("Number2 : "+num2);
		System.out.println("Sum : "+sum);
		System.out.println("********************************");
		char grade;
		boolean status;
		double salary;
		String name;
		System.out.println("----------- Enter grade --------------");
		grade=ref.next().charAt(0);
		System.out.println("----------- Enter status --------------");
		status=ref.nextBoolean();
		System.out.println("----------- Enter salary --------------");
		salary=ref.nextDouble();
		System.out.println("----------- Enter name --------------");
		name=ref.next();
		
		System.out.println("grade: "+grade);
		System.out.println("status: "+status);
		System.out.println("salary: "+salary);
		System.out.println("name: "+name);
		System.out.println("Program Ends");
	}

}
