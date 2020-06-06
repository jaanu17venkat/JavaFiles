package singleInheritance;

public class BluetoothHeadphone extends HeadPhone{
 
	BluetoothHeadphone(){
		System.out.println("wireless headphone");
		volume=100;
	}
	
	public void internetSharing() {
		System.out.println("internet can be shared via bluetooth headset");
	}
	
}
