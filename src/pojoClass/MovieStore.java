package pojoClass;

public class MovieStore {

	Movie[] movies;//array of our own type
	
	MovieStore(){
		movies=new Movie[3];// will create an array of reff
	}
	void addMovie() {
		for(int i=0;i<movies.length;i++) {
			movies[i]=new Movie();
			movies[i].getMovieDetailsFromUser();
		}
		}
		void listAllMovies() {
			for(int i=0;i<movies.length;i++) {
			movies[i].printMovieDetails();	
			}
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MovieStore moviestore=new MovieStore();
moviestore.addMovie();
moviestore.listAllMovies();
	}

}
