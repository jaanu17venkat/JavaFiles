package myBank;

public class SavingsAccount extends Account{

	private double minBalance;
	
void SavingsAccount(){
	
 type="SavingsAccount";
 System.out.println("this is a savings account");
}
 void savingsAccountMinBalance()
{
	minBalance = 5000;
	System.out.println("the minimum balance of savingsaccount is:"+minBalance);
}
}
