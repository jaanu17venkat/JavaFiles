import java.util.Scanner;
public class MinMax {
int min,max;
Scanner sc;

MinMax(){
	sc=new Scanner(System.in);
}

void printBetweenNum() {
	System.out.println("Please enter the min number");
	min= sc.nextInt();
	System.out.println("Please enter the max number");
	 max= sc.nextInt();
	 
	 for(int i=min;i<max;i++)
		 System.out.println(i);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MinMax mm=new MinMax();

mm.printBetweenNum();
	}

}
