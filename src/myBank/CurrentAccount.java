package myBank;

public class CurrentAccount extends Account{
	private double minBalance;
	
 void CurrentAccount(){
	 
	type="CurrentAccount";
	System.out.println("this is a current account");
}



 private void currentAccountMinBalance(){
	minBalance = 10000;
	System.out.println("the minimum balance of currentaccount is:"+minBalance);
}
}
