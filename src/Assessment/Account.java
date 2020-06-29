package Assessment;

import java.util.Scanner;

import day11Work9Jun.Movie;


public class Account implements Comparable<Account>{
/*account_number - String
name - String
password - String
phone - String
balance - Double*/
	private String account_number;
	private String name;
	private String password;
	private String phone;
	private double balance;
	
	Scanner scanner;
	Account(){
		scanner=new Scanner(System.in);
	}
	
	Account(String account_number,String name,String password,String phone,double balance){
		scanner=new Scanner(System.in);
		this.account_number=account_number;
		this.name=name;
		this.password=password;
		this.phone=phone;
		this.balance=balance;
	}
	
	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	void getAccountDetailsFromUser() {
		
		System.out.println("please enter the Account number");

		account_number = scanner.nextLine();
		
		System.out.println("please enter the Account name");
		name = scanner.nextLine();
		System.out.println("please enter the Account password");
		password = scanner.nextLine();
		System.out.println("please enter the Accounter phone");
		phone = scanner.nextLine();
		System.out.println("please enter the balance");
		balance=scanner.nextFloat();

	}
	
	void PrintAccountDetails() {

		System.out.println("Account number is :"+account_number.replaceAll("^[a-zA-Z0-9_]*$","*****"));
		System.out.println("Account name is :"+name);
		System.out.println("Accounter Password is :"+password.replaceAll("^[a-zA-Z0-9_]*$","**********"));
		System.out.println("Account phone number is :"+phone);
		System.out.println("Account balance is :"+balance);
	}
	
@Override
	public String toString() {
		// TODO Auto-generated method stub
	return "accountNumber "+account_number+"\n Name "+name+"\nPassword "+password+"\nPhone "+phone+"\n Balance "+balance;
	
	}
@Override
	public boolean equals(Object obj) {
	Account a2 = (Account)obj;
	Account a1 = this;
	if(a1.getName().equals(a2.getName()) && a1.getPhone()==a2.getPhone())
		return true;
	else
		return false;
}

@Override
public int compareTo(Account o) {
	return this.getName().compareTo(o.getName());
}
	

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Account account = new Account();

	account.getAccountDetailsFromUser();
	account.PrintAccountDetails();
}
}