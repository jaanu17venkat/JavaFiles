package day11Assignment;

import java.util.Scanner;
import java.util.regex.Pattern;
public class Customer {
	private int id;
	private String name;
	private int phone;
	private int age;

	Scanner scanner;
	
	Customer(){
		scanner = new Scanner(System.in);
	}
	
	Customer(String name, int phone,int age){
		scanner = new Scanner(System.in);
		this.name=name;
		this.phone=phone;
		this.age=age;
	}
	
	Customer(int id,String name, int phone,int age){
		scanner = new Scanner(System.in);
		this.id=id;
		this.name=name;
		this.phone=phone;
		this.age=age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	void getCustomerDetailsFromUser() {
		System.out.println("Please enter the customer id");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter the customer name");
		name = scanner.nextLine();
		System.out.println("Please enter the customer phone");
		phone = scanner.nextInt();
		System.out.println("Please enter the customer age");
		age = scanner.nextInt();
	}
	@Override
	public String toString() {
		
		return "Customer ID "+id+"\nCustomer Name "+name+"\nCustomer age"+age+" \nCustomer Phone "+phone.replaceAll(" \\d{3}-\\d{3}-\\d{4} ","X");
	}

	@Override
	public boolean equals(Object obj) {
		Customer c2 = (Customer)obj;
		Customer c1 = this;
		if(c1.getName().equals(c2.getName()) && c1.getPhone()==c2.getPhone())
			return true;
		else
			return false;
	}

	}
