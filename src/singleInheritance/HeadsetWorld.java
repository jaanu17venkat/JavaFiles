package singleInheritance;

public class HeadsetWorld {
	
	void addHeadset() {
		
		HeadPhone jbl=new HeadPhone();
		jbl.hearSong();
		jbl.playAndResume();
		System.out.println("--------------------------");
		BluetoothHeadphone sony=new BluetoothHeadphone();
		sony.internetSharing();
		sony.playAndResume();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeadsetWorld hw=new HeadsetWorld();
		hw.addHeadset();

	}

}
