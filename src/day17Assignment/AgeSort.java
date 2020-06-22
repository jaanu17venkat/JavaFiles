package day17Assignment;
import java.util.Comparator;

public class AgeSort implements Comparator<Application> {

	@Override
	public int compare(Application o1, Application o2) {
		// TODO Auto-generated method stub
		if(o1.getAge()==o2.getAge())
			return 0;
			else if(o1.getAge()>o2.getAge())
				return 1;
			else 
				return -1;
	}
}
