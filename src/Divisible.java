import java.util.Scanner;
public class Divisible {
int n;
Scanner sc;
 
Divisible(){
	sc=new Scanner(System.in);
}
void checkDivisibleBy7() {
	System.out.println("enter a number");
	n=sc.nextInt();
	if(n % 7 == 0)
    {
        System.out.println("Number is divisible by 7");
    }
    else
    {
        System.out.println("Number is not divisible by 7");
    }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Divisible d=new Divisible();
d.checkDivisibleBy7();
	}

}
