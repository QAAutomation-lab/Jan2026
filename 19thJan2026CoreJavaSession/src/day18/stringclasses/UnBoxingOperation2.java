package day18.stringclasses;

public class UnBoxingOperation2 {

	public static void main(String[] args) {
	
		Double doubleObj=25.2566;//primitive type double is getting converted into Double class object
		System.out.println("doubleObj: "+doubleObj);//25.2566
		//un-boxing
		double salary=doubleObj.doubleValue();// 
		System.out.println(salary);//25.2566
		System.out.println(doubleObj==salary);//t
		
		Boolean b=true;//implicit boxing
		boolean b1=b.booleanValue();//explicit un-boxing
		
		Character c1=new Character('a');//explicit boxing
		char c2=c1.charValue();//unboxing
		
		Integer i=25;
		double d=i.intValue();
	}
}
