package customer;

import java.util.Random;
import java.util.Scanner;

public class SilverCustomers extends Customer {

	public void Details1() {
		id2=502;
		name2="janu";
		age2=29;
		phonenum2=" 73654568215 ";
	}
	
	void Luckydraw() {
		for (int i = 0; i < 1;i++)
		{
		    System.out.println("ID: " + id2);
		          System.out.println("Name: " + name2);
		          System.out.println("age: " + age2);
		          System.out.println("phonenum: "+phonenum2 );
		          System.out.println("you are SILVER customer");
		          System.out.println("----------------------" );
		     
		}

		int matchIndex = 0;
		for (int i = 0; i < 1; i++)
		{
		     if (id2== matchIndex)
		     {
		          matchIndex = i;
		          break;
		      }
		     System.out.println("YOU ARE LUCKY");
		     System.out.println("You will get extrapoints");
		}
	}
	void output() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SilverCustomers cd = new SilverCustomers();
		GoldCustomers gd = new GoldCustomers();
		gd.Details();
		gd.PrintGoldCustomers();
		cd.Details1();
		/*cd.PrintSilverCustomer();*/
		cd.Luckydraw();


}
	}


