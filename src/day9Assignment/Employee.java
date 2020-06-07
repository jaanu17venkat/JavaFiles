package day9Assignment;
import  java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Employee {
   int Id;
   String Name;
   int Age;
   int phonenum;

   Scanner sc ;
   
   Employee(){
	   sc = new Scanner(System.in);
   }
 void getEmployeeData()           
 {
 System.out.print("\n\tEnter Employee Id : ");
  Id = Integer.parseInt(sc.nextLine());
 System.out.print("\n\tEnter Employee Name : ");
 Name = sc.nextLine();
 System.out.print("\n\tEnter Employee Age : ");
 Age = Integer.parseInt(sc.nextLine());
 System.out.print("\n\tEnter Employee phonenum : ");
 phonenum = Integer.parseInt(sc.nextLine());
}

void printEmployeeData()           
{
 System.out.print("\n\t" + Id + "\t" +Name + "\t" +Age + "\t" +phonenum);
}

public static void main(String args[])
 {
    Employee[] Emp = new Employee[3];
	int i;
    for(i=0;i<3;i++)
	Emp[i] =  new Employee();
    for(i=0;i<3;i++)
	{
	 System.out.print("\nEnter details of "+ (i+1) +" Employee\n");
	Emp[i].getEmployeeData() ;
}
  System.out.print("\nDetails of Employees\n");
  for(i=0;i<3;i++)
 Emp[i].printEmployeeData() ;
 }
}

