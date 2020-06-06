package customer;
public class GoldCustomers extends Customer {
	
public GoldCustomers() {
		
	System.out.println("goldcustomer type");
      type="Goldcustomer";
	
}
       public void Details() {
  		id1=501;
  		name1="vinu";
  		age1=25;
  		phonenum1="9365458746";
  		id3=504;
  		name3="banu";
  		age3=27;
  		phonenum3="82345698715";
  	}
  	void PrintGoldCustomers() {
  		System.out.println("id is: "+ id1 +" name is: "+ name1 +" the age is: "+ age1 +" the phonenum1: "+ phonenum1);
  		System.out.println("you are gold customer");
  		System.out.println("And you have extrapoints");
  		System.out.println("---------------------");
  		System.out.println("id is: "+ id3 +" name is: "+ name3 +" the age is: "+ age3 +" the phonenum3: "+ phonenum3);
  		System.out.println("you are gold customer");
  		System.out.println("And you have extrapoints");
  		System.out.println("---------------------");
  	}
   

  }


