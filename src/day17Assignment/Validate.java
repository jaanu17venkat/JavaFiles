package day17Assignment;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;


public class Validate extends Application {
	  ArrayList<Application> accDetails;
      Scanner scanner;
    
      Validate(){
             scanner = new Scanner(System.in);
             accDetails = new ArrayList<Application>();
      }
      public void addAccount() {
    		Application account  = new Application();
    		account.GetDetailsFromUser();
    		accDetails.add(account);
    	}
    	public void addAccounts() {
    		

    		String choice = "No";
    		do {
    			addAccount();
    			
    			System.out.println("Do u want to Add Another Account?? Key in Yes for next entry and No for quiting");
    			choice = scanner.nextLine();
    			
    		} while (!choice.toLowerCase().equals("no"));
    	}
    	public void printaccount() {
    		for (Application customer : accDetails) {
    			System.out.println(customer);
    			System.out.println("--------------------");
    		}
    	}
    	
    	Application findcustomerIndex(int age)
    	{
    		for(Application users : accDetails) {
    			if(users != null)
    			{
    				if(users.getAge()==age) {
    					return users;
    				}
    			}
    		}
    		return  null;
    	}
    	
    	void edit() {
    		int age1=0;
    		System.out.println("Please enter the age to be Edit");
    		age1 = scanner.nextInt();
    		Application m1 = findcustomerIndex(age1);
    		System.out.println("The details for Edition");
    		if(m1==null)
    		{
    			System.out.println("No such details");
    		}
    		else
    		{
    			System.out.println(m1);
    			System.out.println("--------------------");
    			
    			System.out.println("Please enter the name for Edit");
    			String name = scanner.nextLine();
    			scanner.nextLine();
    			System.out.println("Please enter the hobbies for Add");
    			String hobbies = scanner.nextLine();
    			System.out.println("Please enter the eamil for Edit");
    			String email= scanner.nextLine();
    	    	m1.setName(name);
    			m1.setHobbies(hobbies);
    			m1.setEmail(email);
    			System.out.println("");
    			System.out.println("");
    			System.out.println("Edited success");
    			System.out.println("--------------------");
    			
    		}
    	}
    	
    	public void deleteDetails() {
    		int age1=0;
    		System.out.println("Please enter the Age to be deleted");
    		age1 = scanner.nextInt();
    		Application m1 = findcustomerIndex(age1);
    		if(m1 == null)
    		{
    			System.out.println("No such details");
    			System.out.println("No details deleted");
    		}
    		else	
    		{
    			System.out.println("The details to be deleted is ");
    			System.out.println(m1);
    		accDetails.remove(m1);
    			System.out.println(" Details deleted");
    			System.out.println("--------------------");
    		}
    			
    	}
    	
    	void chooseOptionForUser() {
    		int userChoice = 0;
    		do {
    			System.out.println("--------------------");
    			System.out.println("1.Edit your details");
    			System.out.println("2. View your details");
    			System.out.println("3. Back");
    			System.out.println("--------------------");
    			userChoice  = scanner.nextInt();
    			switch (userChoice ) {
    			case 1:
    				edit();
    							
    				break;
    			case 2:

    				printaccount();
    								
    				break;
    			
    			
    			
    			case 3:
    				System.out.println("exiting.....");
    				break;
    			default:
    				System.out.println("Invalid option.. Try again");
    				break;
    			}
    			
    		} while (userChoice!=3);
    		
    	}
    	
    	void loginforAdmin() {
    		 
    		scanner = new Scanner(System.in);
    		System.out.println("----------------------------");
    		System.out.println("Login page");
    		System.out.println("----------------------------");
    		System.out.println("Enter the username");
    		username = scanner.nextLine();
    		System.out.println("Enter the password");
    		password=scanner.nextLine();
    		if(username.equals("Admin")&&(password.equals("Admin"))) {
    			System.out.println("login successfully");
    		
    			
    		}
    		else {
    			System.out.println("invalid username or password");
    			loginNew();
    		}
    }
    	
    	void chooseOption() {
    		int userChoice = 0;
    		do {
    			System.out.println("--------------------");
    			System.out.println("1.List all user data");
    			System.out.println("2.Edit user data");
    			System.out.println("3.Delete user data");
    			System.out.println("4.Add user");
    			System.out.println("4.back");
    			System.out.println("--------------------");
    			userChoice  = scanner.nextInt();
    			switch (userChoice ) {
    			case 1:
    				printaccount();			
    				break;
    			case 2:
    				edit();				
    				break;
    			case 3:
    				deleteDetails();			
    				break;
    			case 4:
    				addAccounts();
    				break;
    			case 5:
    				System.out.println("exiting.....");
    				break;
    			default:
    				System.out.println("Invalid option.. Try again");
    				break;
    			}
    			
    		} while (userChoice!=5);
    		
    	}
    	
    	void SortByName() {
    		TreeSet<Application> sm = new TreeSet<Application>(accDetails);
    		accDetails = new ArrayList<Application>(sm);
    		System.out.println("Sorted by name");
    		System.out.println(accDetails);
    		System.out.println("----------------");
    	}
    	void SortByAge() {
    		TreeSet<Application> sm = new TreeSet<Application>(accDetails);
    		accDetails = new ArrayList<Application>(sm);
    		System.out.println("Sorted by Age");
    		System.out.println(accDetails);
    		System.out.println("----------------");
    	}
    	void SortByUsername() {
    		TreeSet<Application> sm = new TreeSet<Application>(accDetails);
    		accDetails = new ArrayList<Application>(sm);
    		System.out.println("Sorted by Username");
    		System.out.println(accDetails);
    		System.out.println("----------------");
    	}
    	    	void ChooseActionForSort() {
    		int userChoice = 0;
    		do {
    			System.out.println("--------------------");
    			System.out.println("1.Sort By Name");
    			System.out.println("2. Sort By Age");
    			System.out.println("3. Sort by Username");
    			System.out.println("4. Exit");
    			System.out.println("--------------------");
    			userChoice  = scanner.nextInt();
    			switch (userChoice ) {
    			case 1:
    				
    				SortByName();			
    				break;
    			case 2:

    				SortByAge();
    								
    				break;
    			
    			case 3:
    				SortByUsername();
    				
					
    				break;
    			
    			case 4:
    				System.out.println("exiting.....");
    				break;
    			default:
    				System.out.println("Invalid option.. Try again");
    				break;
    			}
    			
    		} while (userChoice!=4);
    		
    	}
    	
    	
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Validate val = new Validate();
val.addAccounts();
//am.printaccount();
val.loginNew();
val.chooseOptionForUser();
val.loginforAdmin();
val.chooseOption();
val.ChooseActionForSort();
	}

}