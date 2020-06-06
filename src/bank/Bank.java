package bank;
                                                  
public class Bank {

	Account[] accounts;
	
	Bank(){
		
		accounts=new Account[5];
	}
	/*Bank(){
	int size ;
	 System.out.println("Enter the required size of the array :");
     

     int[] accounts = new int [size];
     System.out.println("Enter the elements of the array one by one ");
    
     for(int i = 0; i<size; i++) {
           }
    
  }*/
		
		void addAccount() {
		for (int i = 0; i < accounts.length; i++) {
			accounts[i]=new Account();
			accounts[i].getAccountDetailsFromUser();	
		}
	}
	void listAllAccounts() {
		for(int i=0;i<accounts.length;i++) {
		accounts[i].printAccountDetails();	
		}
}
	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.addAccount();
		bank.listAllAccounts();
	}
}
