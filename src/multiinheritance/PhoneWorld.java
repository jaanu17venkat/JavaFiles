package multiinheritance;

public class PhoneWorld {
 void phone() {
	 Landline landline=new Landline();
	 System.out.println("landline.type");
	 System.out.println("--------------");
	 showModel(landline);
	landline= new Mobile();
	 System.out.println("landline.type");
	 showModel(landline);
 }
 void showModel(Landline l) {
	l.ring();
	l.call();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneWorld pw=new PhoneWorld();
		pw.phone();
	}

}
