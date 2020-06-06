package singleInheritance;

public class HeadPhone {
int volume;
HeadPhone(){
	System.out.println("this is a headphone");
	volume=10;
}
public void hearSong() {
	System.out.println("hello.....hello");
}
public void playAndResume() {
	System.out.println("play or resume a song " + volume + " volume");
}

}

