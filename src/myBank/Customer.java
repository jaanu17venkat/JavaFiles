package myBank;
import java.util.Scanner; 
public class Customer {
    Account account;
	private int accountNumber;
	
	Customer(){
		
	}

	void createAccount() {
		account = new Account();
		account.printAccountDetails();
		account.getAccountDetails();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
Scanner scanner=new Scanner(System.in);
		System.out.println("enter the account number:");
    	int accountnumber = scanner.nextInt();
    	//System.out.println("enter the account name:");
    	//String name = scanner.nextLine();
    	System.out.println("enter the account balance:");
    	double balance = scanner.nextDouble();
    	System.out.println("enter the account type:");
    	String type = scanner.toString();
    	System.out.println("this is a current account");
    	int minBalance = 10000;
		System.out.println("the minimum balance of currentaccount is:"+minBalance);
			}}



