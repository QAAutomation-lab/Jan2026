package day14.encap;

public class Example3 {
	
	private int empId=101;
	private double salary=45000;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
class Example4 {
	
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example3 ref=new Example3();
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
