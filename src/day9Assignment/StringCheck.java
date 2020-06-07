package day9Assignment;

import java.util.Scanner;

public class StringCheck {
String str;
char ch1,ch2;
Scanner scanner;

StringCheck(){
	scanner=new Scanner(System.in);
	System.out.println("enter the string:");
	str = scanner.nextLine();
	System.out.println("enter any two characters ");
   ch1= scanner.next().charAt(0);
   ch2= scanner.next().charAt(0);
}
void getDetailsFromUser() {
	
   int ch1Pos = str.indexOf(ch1), ch2Pos = str.indexOf(ch2);
   System.out.println(str);
   System.out.println(ch1);
   System.out.println(ch2);
if(ch1Pos > -1){
        if(ch2Pos > -1){
            System.out.println("these two alphabets are present in the string");
            if(ch2Pos > ch1Pos)
                System.out.println("First " + ch1 + " then " + ch2);
            else
             System.out.println("First " + ch2 + " then " + ch1);
        }else {
            System.out.println("Only one alphabet present");
            System.out.println("First " + ch1);
        }
    }else if(ch2Pos > -1){
        System.out.println("Only one alphabet present");
        System.out.println("First " + ch2);
    }else {
        System.out.println("these alphabets are not present in string.");
    }
    
}
public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
StringCheck stringcheck=new StringCheck();
stringcheck.getDetailsFromUser();

	}

}
