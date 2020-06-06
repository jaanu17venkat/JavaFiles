import java.util.Scanner;
public class PrimeNumber {
int num1,num2;
Scanner sc;

PrimeNumber(){
	sc=new Scanner(System.in);
}
boolean isPrime(){
	return false;

}
void primeNumerBetweenNum() {
	System.out.println("Please enter the number");
	num1= sc.nextInt();
	System.out.println("Please enter the number");
	 num2= sc.nextInt();
	 System.out.println("List of prime numbers between" +num1+"and"+num2);
     for(int i=num1;i<=num2;i++)
     {
         if(isPrime(i))
         {
             System.out.println(i);
         }
     }
 }
 boolean isPrime(int n)
 {
     if(n<=1)
     {
         return false;
     }
     for(int i=2;i<=Math.sqrt(n);i++)
     {
         if(n%i==0)
         {
             return false;
         }
     }
     return true;
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PrimeNumber pn=new PrimeNumber();
pn.primeNumerBetweenNum();
boolean checkResult=pn.isPrime();
if(checkResult==true)
	pn.primeNumerBetweenNum();
	}

}
