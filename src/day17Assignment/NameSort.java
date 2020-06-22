package day17Assignment;

import java.util.Comparator;

public class NameSort implements Comparator<Application> {

	@Override
	public int compare(Application o1, Application o2) {
		// TODO Auto-generated method stub
		if(o1.getUsername()==o2.getUsername())
			return 1;
			
			else 
				return -1;

	}

}