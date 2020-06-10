package day12Assignment;

interface customerManager{
	void solveIssues();
	void approveLoan();
	public default void anotherCustomerManager() {
		System.out.println("This is a instance method in the interface customerManager");
	}
	public static void customerMangerMethod() {
		System.out.println("This is in the customerManager interface--static method");
	}
}
interface employeeManager{
	void conductMeeting();
	void setTarget();
	public default void anothercustomerManager() {
		System.out.println("This is a instance method in the interface customerManager");
	}
}
abstract class Employee{
	private int id;
	private String name;
	private int phone;
	private String salarydesignation;
	
abstract void assignDesignation();
}

class Manager extends Employee implements customerManager,employeeManager{

	@Override
	public void conductMeeting() {
		// TODO Auto-generated method stub
		System.out.println("Employees will conduct meeting");
	}

	@Override
	public void setTarget() {
		// TODO Auto-generated method stub
		System.out.println("Employees will set target to achieve their goal");
	}

	@Override
	public void solveIssues() {
		// TODO Auto-generated method stub
		System.out.println("Customers will solve issues they face");
	}

	@Override
	public void approveLoan() {
		// TODO Auto-generated method stub
		System.out.println("Customers will get their loan approval");
	}

	
	
	@Override
	void assignDesignation() {
		// TODO Auto-generated method stub
		System.out.println("Employee will decide their designation");
	}
	
}

public class Office {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Manager manager=new Manager();
manager.assignDesignation();
customerManager customermanagerObject;
customerManager.customerMangerMethod();
customermanagerObject=manager;
customermanagerObject.anotherCustomerManager();
customermanagerObject.solveIssues();
customermanagerObject.approveLoan();

System.out.println("----------------------");
employeeManager employeemanagerObject=manager;
employeemanagerObject.anothercustomerManager();
employeemanagerObject.conductMeeting();
employeemanagerObject.setTarget();

	}

}
