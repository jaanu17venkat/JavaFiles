package multiinheritance;

public class Mobile extends Cordless{
	Mobile(){
		System.out.println("this is a mobile");
		type="handy gadget";
	}
void portable() {
	System.out.println("can be carried easily");
}
void camera() {
	System.out.println("can take a photo");
}
}
