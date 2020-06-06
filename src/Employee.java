
public class Employee {

	int id,age;
	String name;
	
	Employee(){
		id=101;
		name="Ramu";
		age = 23;
	}
	Employee(int eid,String ename,int eage){
		id=eid;
		name=ename;
		age = eage;
	}
	boolean employeeAgeCheck()
	{
	boolean result=false;
	if(age>=18)
	{
	System.out.println("you can join");
	result=true;
	}
	else
		System.out.println("you are under age for employeement");
	return result ;
}
	void work()
	{
		System.out.println("Employee does his work");
	}
	void printEmployeeData() {
		System.out.println("Employee Id : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Age : "+age);
		System.out.println("-----------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		Employee e2 = new Employee(102,"Somu",31);
		e1.id = 101;
		e1.name = "Ramu";
		e1.age = 22;
		e1.printEmployeeData();
		e2.printEmployeeData();

	}



	}


