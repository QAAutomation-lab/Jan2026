package day14.encap;

public class Example1 {
	
	private int empId=101;
	private double salary=45000;
	/*
	 * getter method: this method will help you to access private data member from outside the class
	 * access modifier: public
	 * return type: based on the required private data variable
	 * name: should starts with 'get'
	 * argument: NA
	 * return value: required private variable
	 */
	public int getEmpId() {
		return empId;
	}
	public double getSalary() {
		return salary;
	}
	/*
	 * setter method: this method will help you to modify private data member from outside the class
	 * access modifier: public
	 * return type: void
	 * name: should starts with 'set'
	 * argument: based on required private data member
	 * return value: NA
	 */
	public void setEmpId(int emp) {
		this.empId=empId;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example1 ref=new Example1();
		System.out.println("private variable empId: "+ref.empId);
		System.out.println("private variable salary: "+ref.salary);
		System.out.println("Program ends");
	}
}
class Example2 {
	
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example1 ref=new Example1();
		//System.out.println("private variable empId: "+ref.empId);//CTE: as private members are not accessible from outside the class
		//System.out.println("private variable salary: "+ref.salary);//CTE: as private members are not accessible from outside the class
		
		System.out.println("accessing private empId using getter method: "+ref.getEmpId());
		System.out.println("accessing private salary using getter method: "+ref.getSalary());
		
		//modify private variable from outside the class using setter method
		ref.setEmpId(501);
		ref.setSalary(55000);
		System.out.println("updated, accessing private empId using getter method: "+ref.getEmpId());
		System.out.println("updated, accessing private salary using getter method: "+ref.getSalary());
		System.out.println("Program ends");
	}
}
