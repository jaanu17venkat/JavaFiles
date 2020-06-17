package day16Assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class AccountSet {
ArrayList<Account> accounts;
public AccountSet() {
	accounts = new ArrayList<Account>();
}
void addAccount() {
	Account account = new Account();
	account.GetMovieDetails();
	accounts.add(account);
	account = new Account();
	account.GetMovieDetails();
	accounts.add(account);
}
void print() {
	TreeSet<Account> sm = new TreeSet<Account>(accounts);
	accounts = new ArrayList<Account>(sm);
	System.out.println("sorted by name");
	System.out.println(accounts);
	System.out.println("----------------");
	System.out.println("Sorted by age");
	System.out.println(accounts);
	System.out.println("----------------");
	System.out.println("sorted by balance");
	System.out.println(accounts);
	System.out.println("----------------");
	}
void fileCreate() {

	try {
		File myfile = new File("C:\\Users\\janani\\eclipse-workspace\\SpineBizProject\\src\\day15Assignment\\namesort");
		File f1 = new File("C:\\Users\\janani\\eclipse-workspace\\SpineBizProject\\src\\day15Assignment\\agesort");
		File f2 = new File("C:\\Users\\janani\\eclipse-workspace\\SpineBizProject\\src\\day15Assignment\\balancesort");

		if(myfile.createNewFile()) {
			System.out.println("File 1 created :"+myfile.getName());
			System.out.println("File 2 created :"+f1.getName());
			System.out.println("File 3 created :"+f2.getName());
			
		}
		else {
			System.out.println("file already exist");
		}
	}catch (IOException e) {
		System.out.println("An error occured");
		e.printStackTrace();}
	}

void readAndwriteFile() {
	try {
		FileWriter mywriter = new FileWriter("C:\\Users\\janani\\eclipse-workspace\\SpineBizProject\\src\\day15Assignment\\namesort");
		mywriter.write("\nsorted by Account-number\r\n" + 
				"[ac num105\r\n" + 
				"  nameddd\r\n" + 
				"  phone63987412\r\n" + 
				"  age is24\r\n" + 
				" balance25000.0, ac num101\r\n" + 
				"  nameqqq\r\n" + 
				"  phone97863937\r\n" + 
				"  age is36\r\n" + 
				" balance36000.0]");
		FileWriter mywriter1 = new FileWriter("C:\\Users\\janani\\eclipse-workspace\\SpineBizProject\\src\\day15Assignment\\agesort");
		mywriter1.write("\nsorted by phone-number\r\n" + 
				"[ac num105\r\n" + 
				"  nameddd\r\n" + 
				"  phone63987412\r\n" + 
				"  age is24\r\n" + 
				" balance25000.0, ac num101\r\n" + 
				"  nameqqq\r\n" + 
				"  phone97863937\r\n" + 
				"  age is36\r\n" + 
				" balance36000.0]\r\n" + 
				"----------------");
		FileWriter mywriter2 = new FileWriter("C:\\Users\\janani\\eclipse-workspace\\SpineBizProject\\src\\day15Assignment\\balancesort");
		mywriter2.write("\nSorted by name\r\n" + 
				"[ac num105\r\n" + 
				"  nameddd\r\n" + 
				"  phone63987412\r\n" + 
				"  age is24\r\n" + 
				" balance25000.0, ac num101\r\n" + 
				"  nameqqq\r\n" + 
				"  phone97863937\r\n" + 
				"  age is36\r\n" + 
				" balance36000.0]");
		mywriter.close();
		mywriter1.close();
		mywriter2.close();
		
		System.out.println("Successfully wrote");
	}catch(IOException e) {
		System.out.println("an occured error");
		e.printStackTrace();
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountSet accountsett = new AccountSet();
		accountsett.addAccount();
		accountsett.print();
		accountsett.fileCreate();
		accountsett.readAndwriteFile();
	}

}