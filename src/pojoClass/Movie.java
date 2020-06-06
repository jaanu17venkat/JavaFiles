package pojoClass;
import java.util.Scanner;
public class Movie {

	private int id;
	private String name;
	private float duration;
	
	Scanner scanner;
	
	Movie(){
		scanner=new Scanner(System.in);
		
	}
	Movie(String name,float duration){
		scanner=new Scanner(System.in);
		this.name=name;
		this.duration=duration;
		
	}
	Movie(int id,String name,float duration){
		this.id=id;
		this.name=name;
		this.duration=duration;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	void getMovieDetailsFromUser() {
		System.out.println("please enter the movie id");
		id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("please enter the movie name");
		name=scanner.nextLine();
		System.out.println("please enter the movie duration");
		duration=scanner.nextFloat();
		
	}
	void printMovieDetails() {
		System.out.println("movie id"+id+"\nMovie name"+name+"\nmovie duration"+duration);
		System.out.println("---------------------------------");
	}
}

