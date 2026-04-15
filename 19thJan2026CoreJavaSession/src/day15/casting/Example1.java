package day15.casting;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=25;
		//widening can be performed implicitly or explicitly depending on need
		float num2=num1;//auto/implicit widening. compiler will float num2=(float)num1;
		float num3=(float)num1;//explicit widening
		
		double num4=(double)num1;//explicit widening
		double num5=num3;//auto/implicit widening
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		System.out.println("num3: "+num3);
		System.out.println("num4: "+num4);
		System.out.println("num5: "+num5);	
		
		System.out.println("*****************************");
		//narrowing: should be performed explicitly, and there must some loss in terms of data/size/both
		double x=25.36;
		int y=(int)x;//explicit narrowing --> data loss / size loss / both
		long z=(long)x;//explicit narrowing -->data loss
		float a=(float)x;//explicit narrowing -->size loss
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("z: "+z);
		System.out.println("a: "+a);
		System.out.println("Program Ends");
	}

}
/*
byte
short
int
long
float
double

*/