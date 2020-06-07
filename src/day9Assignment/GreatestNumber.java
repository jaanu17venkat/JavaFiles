package day9Assignment;

import java.util.Scanner;

public class GreatestNumber {
int x,y,z;

Scanner scanner;

GreatestNumber(){
	scanner=new Scanner(System.in);
	}

	void getDetailsFromUser() {
		 System.out.print("Enter the first number:");
	        x = scanner.nextInt();
	        System.out.print("Enter the second number:");
	        y = scanner.nextInt();
	        System.out.print("Enter the third number:");
	        z = scanner.nextInt();
	 
		}
	void printGreaterNumberDetails() {
		if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }
	}
	public static void main(StringCheck[] args) {
		// TODO Auto-generated method stub
		GreatestNumber greatestnumber=new GreatestNumber();
		greatestnumber.getDetailsFromUser();
		greatestnumber.printGreaterNumberDetails();
	}

}
