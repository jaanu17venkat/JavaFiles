package day9Assignment;

import java.util.Scanner;

public class ArithmeticCalcution {
	
int x,y,add,sub,mul,div;
Scanner scanner;
int cal;

ArithmeticCalcution (){
	scanner=new Scanner(System.in);
}
void performingArithmeticOperation() {
	System.out.println("Enter the two numbers to perform operations ");
    System.out.print("Enter the first number : ");
    int x = scanner.nextInt();
    System.out.print("Enter the second number : ");
    int y = scanner.nextInt();
    while(true)
    {
    System.out.println("Choose the operation you want to perform ");
	System.out.println("Enter 1 for ADDITION");
    System.out.println("Enter 2 for SUBTRACTION");
    System.out.println("Enter 3 for MULTIPLICATION");
    System.out.println("Enter 4 for DIVISION");
    System.out.println("Enter 5 to EXIT");
    cal = scanner.nextInt();
    

    switch(cal)
    {
        case 1:
        add = x + y;
        System.err.println("You have choosen addition");
        System.out.println("Result:"+add);
        break;

        case 2:
        sub = x - y;
        System.err.println("You have choosen subtraction");
        System.out.println("Result:"+sub);
        break;

        case 3:
        mul = x * y;
        System.err.println("You have choosen multiplication");
        System.out.println("Result:"+mul);
        break;

        case 4:
        div = x / y;
        System.err.println("You have choosen division");
        System.out.println("Result:"+div);
        break;    

        case 5:
            System.err.println("You are trying to exit");
        	System.out.println("exit");
    }
    }
}

	public static void main(StringCheck[] args) {
		// TODO Auto-generated method stub
		ArithmeticCalcution arithmeticcalcution=new ArithmeticCalcution();
		arithmeticcalcution.performingArithmeticOperation();
		
		
	}

}
