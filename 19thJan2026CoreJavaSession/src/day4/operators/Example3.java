package day4.operators;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=25,num2=45;
		boolean res1=(num1==num2);//f
		boolean res2=(num1!=num2);//t
//		boolean res3=(res1 && res2);//f
//		boolean res4=(res1 || res2);//t
		
		System.out.println("res1: "+res1);
		System.out.println("res2: "+res2);
		System.out.println("res3: "+(res1 && res2));
		System.out.println("res4: "+(res1 || res2));

		
		System.out.println("res5: "+((num1==num2) && (num1!=num2)));
		System.out.println("Program Ends");
	}

}
/*
cond1 && cond2
	*cond1 & cond2 both will give you boolean result
	*if both are true then result will be true
	*if anyone of them is false then final result will be false 

cond1 || cond2
	*cond1 & cond2 both will give you boolean result
	*if both are true then result will be true
	*if anyone of them is true then final result will be true 

*/