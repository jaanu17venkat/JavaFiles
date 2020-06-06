package myBank;
import  java.util.Scanner;
public class Account {
	
	String name;
	int accountnumber;
	String type;
	double balance;

Scanner scanner; 
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return accountnumber;
	}
	public void setNumber(String number) {
		this.accountnumber = accountnumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
public void Transaction(float amount,String action) {
	
} public void deposit(int amount)
	  {
	  balance += amount ;
			  if(balance>amount){;  
	  System.out.println("enter the depositing amount"+amount);
	
	 }
	  }
	
	    public String withdraw(int amount){
	        if(balance<amount){
	           
	            System.out.println("enter the amount to withdraw"+amount);
	            return "Withdraw "+amount+" (Insufficient Balance)";
	        } else{
	            balance -= amount;
	            return "Withdraw "+amount;
	        } 
	        }
	        void Account() {
	       scanner=new Scanner(System.in);
	        
	    }
	        void printAccountDetails() {
	        	System.out.println("accountname:"+name );
	        	System.out.println("accountnumber"+accountnumber);
	        	System.out.println("accountbalance"+balance);
	        	System.out.println("accounttype"+type);
	        }
	        
	        void  getAccountDetails(){
	        	System.out.println("enter the account number:");
	        	accountnumber = scanner.nextInt();
	        	System.out.println("enter the account name:");
	        	name = scanner.nextLine();
	        	System.out.println("enter the account balance:");
	        	balance=scanner.nextDouble();
	        	System.out.println("enter the account type:");
	        	type=scanner.nextLine();
	        }

	    public void Transaction(float amount) {
	        Transaction(amount, "deposit");
	    }

}


