
public class MovieConstructor {
	int id,duration;
	String name,actorname;
	 MovieConstructor(){
		id=101;
		duration=2020;
		name="ramu";
		actorname="raj";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieConstructor m=new MovieConstructor();
		System.out.println("movie id:"+m.id);
		System.out.println("movie name:"+m.name);
		System.out.println("movie actorname:"+m.actorname);
		System.out.println("movie duration:"+m.duration);
	}

}
